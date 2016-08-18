<?xml version="1.0" encoding="UTF-8"?>
<xmi:XMI xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:exercise="platform:/plugin/no.hal.learning.exercise.model/model/exercise.ecore" xmlns:jdt="platform:/plugin/no.hal.learning.exercise.jdt/model/jdt-exercise.ecore" xmlns:junit="platform:/plugin/no.hal.learning.exercise.junit/model/junit-exercise.ecore" xmlns:workbench="platform:/plugin/no.hal.learning.exercise.workbench/model/workbench-exercise.ecore">
  <exercise:Exercise>
    <parts xsi:type="exercise:ExercisePart" name="" title="Workbench tasks">
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Suspend the execution of a class at a breakpoint"/>
        <a xsi:type="workbench:DebugEventAnswer" elementId="" action="suspend.breakpoint"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Use the debug task Step Over"/>
        <a xsi:type="workbench:CommandExecutionAnswer" elementId="org.eclipse.debug.ui.commands.StepOver" action="executeSuccess"/>
      </tasks>
    </parts>
    <parts xsi:type="exercise:ExercisePart" name="" title="Java">
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Counter class completed"/>
        <a xsi:type="jdt:JdtClassAnswer" className="Counter">
          <methodNames>Counter</methodNames>
          <methodNames>getCounter</methodNames>
          <methodNames>count</methodNames>
        </a>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run CounterTest successfully"/>
        <a xsi:type="junit:JunitTestAnswer" testRunName="CounterTest">
          <methodNames>testCounter</methodNames>
          <methodNames>testCount</methodNames>
        </a>
      </tasks>
    </parts>
  </exercise:Exercise>
  <exercise:ExerciseProposals exercise="/0">
    <proposals exercisePart="/0/@parts.0">
      <proposals xsi:type="workbench:DebugEventProposal" question="/0/@parts.0/@tasks.0/@q" answer="/0/@parts.0/@tasks.0/@a"/>
      <proposals xsi:type="workbench:CommandExecutionProposal" question="/0/@parts.0/@tasks.1/@q" answer="/0/@parts.0/@tasks.1/@a"/>
    </proposals>
    <proposals exercisePart="/0/@parts.1">
      <proposals xsi:type="jdt:JdtClassProposal" question="/0/@parts.1/@tasks.0/@q" answer="/0/@parts.1/@tasks.0/@a">
        <attempts xsi:type="jdt:JdtClassEvent" timestamp="1455658198951" sourceCode="package no.hal.quiz.junit.examples;&#xA;&#xA;/**&#xA; * Simple counter&#xA; * @author hal&#xA; * @see you, it doesn't matter that much&#xA; * does it&#xA; */&#xA;public class Counter {&#xA;&#xA;&#x9;private int counter, end;&#xA;&#x9;&#xA;&#x9;public Counter(int end) {&#xA;&#x9;&#x9;this.end = end;&#xA;&#x9;}&#xA;&#xA;&#x9;public int getCounter() {&#xA;&#x9;&#x9;return counter;&#xA;&#x9;}&#xA;&#xA;&#x9;&#xA;&#x9;public int count() {&#xA;&#x9;&#x9;if (counter &lt; end) {&#xA;&#x9;&#x9;&#x9;counter++;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return counter;&#xA;&#x9;}&#xA;}&#xA;" sizeMeasure="28"/>
        <attempts xsi:type="jdt:JdtClassEvent" timestamp="1455658686072" sourceCode="package no.hal.quiz.junit.examples;&#xA;&#xA;/**&#xA; * Simple counter&#xA; * @author hal&#xA; * @see you, it doesn't matter that much&#xA; * does it&#xA; */&#xA;public class Counter {&#xA;&#xA;&#x9;private int counter, end, x;&#xA;&#x9;&#xA;&#x9;public Counter(int end) {&#xA;&#x9;&#x9;this.end = end;&#xA;&#x9;}&#xA;&#xA;&#x9;public int getCounter() {&#xA;&#x9;&#x9;return counter;&#xA;&#x9;}&#xA;&#xA;&#x9;&#xA;&#x9;public int count() {&#xA;&#x9;&#x9;if (counter &lt; end) {&#xA;&#x9;&#x9;&#x9;counter++;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return counter;&#xA;&#x9;}&#xA;}&#xA;" sizeMeasure="28" warningCount="1"/>
        <attempts xsi:type="jdt:JdtClassEvent" timestamp="1455658724574" sourceCode="package no.hal.quiz.junit.examples;&#xA;&#xA;/**&#xA; * Simple counter&#xA; * @author hal&#xA; * @see you, it doesn't matter that much&#xA; * does it&#xA; */&#xA;public class Counter {&#xA;&#xA;&#x9;private int counter, end;&#xA;&#x9;&#xA;&#x9;public Counter(int end) {&#xA;&#x9;&#x9;this.end = end;&#xA;&#x9;}&#xA;&#xA;&#x9;public int getCounter() {&#xA;&#x9;&#x9;return counter;&#xA;&#x9;}&#xA;&#xA;&#x9;&#xA;&#x9;public int count() {&#xA;&#x9;&#x9;if (counter &lt; end) {&#xA;&#x9;&#x9;&#x9;counter++;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return counter;&#xA;&#x9;}&#xA;}&#xA;" sizeMeasure="28"/>
      </proposals>
      <proposals xsi:type="junit:JunitTestProposal" question="/0/@parts.1/@tasks.1/@q" answer="/0/@parts.1/@tasks.1/@a"/>
    </proposals>
  </exercise:ExerciseProposals>
</xmi:XMI>
