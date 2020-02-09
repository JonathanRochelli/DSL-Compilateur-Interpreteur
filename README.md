# DSL-Compilateur-Interpreteur

## Model

![Alt text](model/model.PNG?raw=true "Model")

## Exemple d'utilisation du DSL
```
FSM mydsl
initial start
final end
state s1
state s2
transition t1 start->s1 : trigger on
transition t2 s1->s2 : trigger next
transition t3 s2->end : trigger off
```

## Lors de la sauvergarde, ce code générera 7 classes :
- Finale.java
- Initial.java
- main.java
- s1.java
- s2.java
- State.java
- mydsl.java

## Exemple de fichier xmi

![Alt text](model/xmi.PNG?raw=true "XMI")
