# no.hal.pg.runtime - the generic runtime model

The generic runtime model contains the generic classes for (representing) the game state during execution. The model is in [model/pg-runtime.ecore](model/pg-runtime.ecore). The most important classes are the following:

* <a name="Game">**Game**</a> - a game definition consisting of a set of **Task**s.
* <a name="Task">**Task**</a> - the superclass of all tasks. It is parameterized with the corresponding [TaskDef](../no.hal.pg.model/readme.md#TaskDef) class and contains a reference to it, since it typically will need to query it. Modules contributing new kinds of tasks will typically also need to subclass **Task** and provide an engine that can map from the TaskDef to the corresponding **Task**.
* <a name="Player">**Player**</a> - a [Person](../no.hal.pg.model/readme.md#Person) playing a game.
