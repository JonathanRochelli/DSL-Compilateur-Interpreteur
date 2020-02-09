package fsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.ut2j.m1ice.fsm.Initial;
import fsm.aspects.StateAspect;

@Aspect(className = Initial.class)
@SuppressWarnings("all")
public class InitialAspect extends StateAspect {
}
