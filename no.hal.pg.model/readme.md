# no.hal.pg.model - the generic game model

The generic game model contains the generic classes for describing a game consisting of a set of tasks. The model is in [model/pg.ecore](model/pg.ecore). The most important classes are the following:

* <a name="GameDef">**GameDef**</a> - a game definition consisting of a set of **TaskDef**s. The tasks can either be contained in the **GameRef** (**tasks** reference) or referenced (**taskRefs** reference). To read all of them, use the *derived* **allTasks** reference.
* <a name="TaskDef">**TaskDef**</a> - the superclass of all task descriptions. For testing purposes we want to instantiate it, so it cannot be *abstract*, but it should be considered as such. Modules contributing new kinds of tasks must subclass **TaskDef**
* <a name="Person">**Person**</a> - a person, but not (yet) related to a game as a [Player](../no.hal.pg.runtime/readme.md#Player).
