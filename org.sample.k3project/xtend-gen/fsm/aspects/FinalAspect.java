package fsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.ut2j.m1ice.fsm.Final;
import fsm.aspects.StateAspect;

@Aspect(className = Final.class)
@SuppressWarnings("all")
public class FinalAspect extends StateAspect {
}
