# DSL-Compilateur-Interpreteur

##Model

![Alt text](model/model.png?raw=true "Model")

##Exemple d'utilisation du DSL
```
FSM mydsl
initial in
final fin
state s1
state s2
transition t1 in->s1 : trigger on
transition t1 s1->s2 : trigger next
transition t2 s2->fin : trigger off
```

##Lors de la sauvergarde, ce code générera 7 classes :
- Finale.java
- Initial.java
- main.java
- s1.java
- s2.java
- State.java
- mydsl.java

##Exemple de fihier xmi

![Alt text](model/xmi.png?raw=true "XMI")
