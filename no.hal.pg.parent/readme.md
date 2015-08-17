# TDT4250 - Advanced Software Design

Generic techniques for modeling, design and implementation of modular software, focussing on industrial techniques and domains. Component-based design, component-based architectures and frameworks, distributed component-based systems. Model-driven development of software, code generation and domain-specific languages. Testing, continuous integration, deployment and governance.

## The Pervasive Game project

This project implements a simple pervasive game in the "treasure hunt" genre. The player must complete a set of game tasks to complete the game. There are lots of different kinds of tasks which are contributed by the various sub-projects. Contributing a new kind of tasks consists of contributing
* a model for describing the task (static structure)
* a model for the dynamic state used at runtime
* an engine implementing the dynamic behavior

This repository contains modules implementing the generic engine and an example task, a Quiz:
- [no.hal.pg.model - the generic model](../no.hal.pg.model/readme.md)
- no.hal.pg.model.tests - tests for the generic model
- no.hal.pg.runtime - the generic, runtime implementation
- no.hal.pg.runtime.tests - tests for the generic, runtime implementation
- no.hal.pg.quiz.model - the quiz task model
- no.hal.pg.quiz.model.tests - tests for the quiz task model
- no.hal.pg.quiz.runtime - the quiz runtime
- no.hal.pg.quiz.runtime.tests - tests for the quiz runtime
- no.hal.pg.quiz.xtext - the Xtext-based quiz DSL grammar and parser project
- no.hal.pg.quiz.xtext.tests - tests for the Xtext-based quiz DSL editor project
- no.hal.pg.quiz.xtext.ui - the Xtext-based quiz DSL editor project
- no.hal.pg.model.feature - feature project for the authoring environment
- no.hal.pg.runtime.feature - feature project for the runtime environment
- no.hal.pg.updatesite - update site project

 Each kind of task is described by an object structure according to a *game model* 

##
Wiki page: https://www.ntnu.no/wiki/display/tdt4250
