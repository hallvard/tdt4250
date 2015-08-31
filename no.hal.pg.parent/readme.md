# The Pervasive Game project

This project implements a simple pervasive game in the "treasure hunt" genre. The player must complete a set of game tasks to complete the game. There are lots of different kinds of tasks which are contributed by the various sub-projects. Contributing a new kind of tasks consists of contributing
* a model for describing the task (static structure)
* a model for the dynamic state used at runtime
* an engine implementing the dynamic behavior

This repository contains modules implementing the generic engine and an example task, a Quiz:
- [no.hal.pg.model - the generic model](../no.hal.pg.model/)
- [no.hal.pg.model.tests - tests for the generic model](../no.hal.pg.model.tests/)
- [no.hal.pg.runtime - the generic, runtime implementation](../no.hal.pg.runtime/)
- [no.hal.pg.runtime.tests - tests for the generic, runtime implementation](../no.hal.pg.runtime.tests/)
- [no.hal.pg.quiz.model - the quiz task model](../no.hal.pg.quiz.model/)
- [no.hal.pg.quiz.model.tests - tests for the quiz task model](../no.hal.pg.quiz.model.tests/)
- [no.hal.pg.quiz.runtime - the quiz runtime](../no.hal.pg.quiz.runtime/)
- [no.hal.pg.quiz.runtime.tests - tests for the quiz runtime](../no.hal.pg.quiz.runtime.tests/)
- [no.hal.pg.quiz.xtext - the Xtext-based quiz DSL grammar and parser project](../no.hal.pg.quiz.xtext/)
- [no.hal.pg.quiz.xtext.tests - tests for the Xtext-based quiz DSL editor project](../no.hal.pg.quiz.xtext.tests/)
- [no.hal.pg.quiz.xtext.ui - the Xtext-based quiz DSL editor project](../no.hal.pg.quiz.xtext.ui/)
- [no.hal.pg.model.feature - feature project for the authoring environment](../no.hal.pg.model.feature/)
- [no.hal.pg.runtime.feature - feature project for the runtime environment](../no.hal.pg.runtime.feature/)
- [no.hal.pg.updatesite - update site project](../no.hal.pg.updatesite/)

Note that the generic part and the quiz task part have separate Maven parent projects, to make it easier to only depend on the generic part and leave out the Quiz task. 