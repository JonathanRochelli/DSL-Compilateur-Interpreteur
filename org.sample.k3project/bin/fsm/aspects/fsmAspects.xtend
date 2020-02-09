package fsm.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import java.util.Scanner; 

import fr.ut2j.m1ice.fsm.FSM
import fr.ut2j.m1ice.fsm.Transition
import fr.ut2j.m1ice.fsm.State
import fr.ut2j.m1ice.fsm.Initial
import fr.ut2j.m1ice.fsm.Final

import static extension fsm.aspects.FSMAspect.*
import static extension fsm.aspects.TransitionAspect.*
import static extension fsm.aspects.StateAspect.*
import static extension fsm.aspects.InitialAspect.*
import static extension fsm.aspects.FinalAspect.*
import fr.ut2j.m1ice.fsm.FsmPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

class Interpreter {
	def static void main(String[] args) {
		FsmPackage.eINSTANCE.class
		Resource$Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl());
		var Resource resource = new ResourceSetImpl().getResource(URI.createURI('\\Users\\AdminEtu\\Documents\\workspace\\fr.ut2j.m1ice.fsm\\model\\FSM.xmi'), true);
		var myfsm = resource.contents.get(0) as FSM
		myfsm.interprete
	}
}

@Aspect(className=FSM)
class FSMAspect {
	
	static State current
	Scanner sc = new Scanner(System.in);
	static String str	
	
	def void interprete()
	{
		/*
		 * Selection du state initial parmis la liste des states
		 */
		for (state : _self.state)
		{
			if (state instanceof Initial)
			{
				current = state
			}
		}
		
		/*
		 * Tant que le state n'est pas une instance de final
		 */
		while (!(current instanceof Final))
		{		
			/*
			 * Pour chaques transitions
			 */	
			for (transition : _self.transition)
			{
				/*
				 * Demande du trigger
				 */
				System.out.println("Veuillez saisir un trigger :");
				str = _self.sc.nextLine();
				System.out.println("Vous avez saisi : " + str);
				/*
				 * Si l'état et le trigger sont corrects
				 */
				if (transition.state.get(0).name == current.name && transition.trigger == str)
				{
					/*
					 * Changement d'état
					 */
					System.out.println("Changement d'état de "+current.name+" à "+transition.state.get(1).name);
					current = transition.state.get(1);
				}
			
			}
		}
		System.out.println("La machine est dans son état final");

	}

}

@Aspect(className=Transition)
class TransitionAspect {

}

@Aspect(className=State)
class StateAspect {

}

@Aspect(className=Initial)
class InitialAspect extends StateAspect {


}

@Aspect(className=Final)
class FinalAspect extends StateAspect {

}



