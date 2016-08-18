<?xml version="1.0" encoding="UTF-8"?>
<xmi:XMI xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:exercise="platform:/plugin/no.hal.learning.exercise.model/model/exercise.ecore" xmlns:jdt="platform:/plugin/no.hal.learning.exercise.jdt/model/jdt-exercise.ecore" xmlns:junit="platform:/plugin/no.hal.learning.exercise.junit/model/junit-exercise.ecore" xmlns:workbench="platform:/plugin/no.hal.learning.exercise.workbench/model/workbench-exercise.ecore">
  <exercise:Exercise>
    <parts xsi:type="exercise:ExercisePart" name="" title="Workbench tasks">
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Use run in debug mode command"/>
        <a xsi:type="workbench:CommandExecutionAnswer" elementId="org.eclipse.debug.ui.commands.DebugLast"/>
      </tasks>
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
        <a xsi:type="jdt:JdtSourceEditAnswer" className="Counter">
          <methodNames>Counter</methodNames>
          <methodNames>getCounter</methodNames>
          <methodNames>count</methodNames>
        </a>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run Counter class"/>
        <a xsi:type="jdt:JdtLaunchAnswer" className="Counter"/>
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
      <proposals xsi:type="workbench:CommandExecutionProposal" question="/0/@parts.0/@tasks.0/@q" answer="/0/@parts.0/@tasks.0/@a"/>
      <proposals xsi:type="workbench:DebugEventProposal" question="/0/@parts.0/@tasks.1/@q" answer="/0/@parts.0/@tasks.1/@a" completion="0.0" performedCount="1">
        <attempts timestamp="-1" completion="0.0"/>
        <attempts timestamp="-1" completion="0.0"/>
      </proposals>
      <proposals xsi:type="workbench:CommandExecutionProposal" question="/0/@parts.0/@tasks.2/@q" answer="/0/@parts.0/@tasks.2/@a" completion="0.0" performedCount="2">
        <attempts timestamp="-1" completion="0.0"/>
        <attempts timestamp="-1" completion="0.0"/>
      </proposals>
    </proposals>
    <proposals exercisePart="/0/@parts.1">
      <proposals xsi:type="jdt:JdtSourceEditProposal" question="/0/@parts.1/@tasks.0/@q" answer="/0/@parts.1/@tasks.0/@a">
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1455699849655" sourceCode="package no.hal.quiz.junit.examples;&#xA;&#xA;/**&#xA; * Simple counter&#xA; * @author hal&#xA; * @see you, it doesn't matter that much&#xA; * does it&#xA; */&#xA;public class Counter {&#xA;&#xA;&#x9;private int counter, end;&#xA;&#x9;&#xA;&#x9;public Counter(int end) {&#xA;&#x9;&#x9;this.end = end;&#xA;&#x9;}&#xA;&#xA;&#x9;public int getCounter() {&#xA;&#x9;&#x9;return counter;&#xA;&#x9;}&#xA;&#xA;&#x9;&#xA;&#x9;public int count() {&#xA;&#x9;&#x9;if (counter &lt; end) {&#xA;&#x9;&#x9;&#x9;counter++;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return counter;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public static void main(String[] args) {&#xA;&#x9;&#x9;new Counter().count();&#xA;&#x9;}&#xA;}&#xA;" sizeMeasure="32" errorCount="1"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1455699855615" sourceCode="package no.hal.quiz.junit.examples;&#xA;&#xA;/**&#xA; * Simple counter&#xA; * @author hal&#xA; * @see you, it doesn't matter that much&#xA; * does it&#xA; */&#xA;public class Counter {&#xA;&#xA;&#x9;private int counter, end;&#xA;&#x9;&#xA;&#x9;public Counter(int end) {&#xA;&#x9;&#x9;this.end = end;&#xA;&#x9;}&#xA;&#xA;&#x9;public int getCounter() {&#xA;&#x9;&#x9;return counter;&#xA;&#x9;}&#xA;&#xA;&#x9;&#xA;&#x9;public int count() {&#xA;&#x9;&#x9;if (counter &lt; end) {&#xA;&#x9;&#x9;&#x9;counter++;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return counter;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public static void main(String[] args) {&#xA;&#x9;&#x9;new Counter(3).count();&#xA;&#x9;}&#xA;}&#xA;" sizeMeasure="32"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1455699867598" sourceCode="package no.hal.quiz.junit.examples;&#xA;&#xA;/**&#xA; * Simple counter&#xA; * @author hal&#xA; * @see you, it doesn't matter that much&#xA; * does it&#xA; */&#xA;public class Counter {&#xA;&#xA;&#x9;private int counter, end;&#xA;&#x9;&#xA;&#x9;public Counter(int end) {&#xA;&#x9;&#x9;this.end = end;&#xA;&#x9;}&#xA;&#xA;&#x9;public int getCounter() {&#xA;&#x9;&#x9;return counter;&#xA;&#x9;}&#xA;&#xA;&#x9;&#xA;&#x9;public int count() {&#xA;&#x9;&#x9;if (counter &lt; end) {&#xA;&#x9;&#x9;&#x9;counter++;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return counter;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public static void main(String[] args) {&#xA;&#x9;&#x9;System.out.println(new Counter(3).count());&#xA;&#x9;}&#xA;}&#xA;" sizeMeasure="32"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1455735214981" sourceCode="package no.hal.quiz.junit.examples;&#xA;&#xA;/**&#xA; * Simple counter&#xA; * @author hal&#xA; * @see you, it doesn't matter that much&#xA; * does it&#xA; */&#xA;public class Counter {&#xA;&#xA;&#x9;private int counter, end;&#xA;&#x9;&#xA;&#x9;public Counter(int end) {&#xA;&#x9;&#x9;this.end = end;&#xA;&#x9;}&#xA;&#xA;&#x9;public int getCounter() {&#xA;&#x9;&#x9;return counter;&#xA;&#x9;}&#xA;hfjdsfkhs&#xA;&#x9;&#xA;&#x9;public int count() {&#xA;&#x9;&#x9;if (counter &lt; end) {&#xA;&#x9;&#x9;&#x9;counter++;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return counter;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public static void main(String[] args) {&#xA;&#x9;&#x9;System.out.println(new Counter(3).count());&#xA;&#x9;}&#xA;}&#xA;" sizeMeasure="32" errorCount="1"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1455735226577" sourceCode="package no.hal.quiz.junit.examples;&#xA;&#xA;/**&#xA; * Simple counter&#xA; * @author hal&#xA; * @see you, it doesn't matter that much&#xA; * does it&#xA; */&#xA;public class Counter {&#xA;&#xA;&#x9;private int counter, end;&#xA;&#x9;&#xA;&#x9;public Counter(int end) {&#xA;&#x9;&#x9;this.end = end;&#xA;&#x9;}&#xA;&#xA;&#x9;public int getCounter() {&#xA;&#x9;&#x9;return counter;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public int count() {&#xA;&#x9;&#x9;if (counter &lt; end) {&#xA;&#x9;&#x9;&#x9;counter++;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return counter;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public static void main(String[] args) {&#xA;&#x9;&#x9;System.out.println(new Counter(3).count());&#xA;&#x9;}&#xA;}&#xA;" sizeMeasure="31"/>
      </proposals>
      <proposals xsi:type="jdt:JdtLaunchProposal" question="/0/@parts.1/@tasks.1/@q" answer="/0/@parts.1/@tasks.1/@a">
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1455699875403"/>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1455700776273"/>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1455700802075"/>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1455701584223"/>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1455701695149"/>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1455703231058" mode="run"/>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1455703392309" mode="run"/>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1455704045594" mode="run"/>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1455704131720" mode="run"/>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1455704711019" mode="run"/>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1455704761059" mode="run"/>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1455735391443" mode="debug"/>
      </proposals>
      <proposals xsi:type="junit:JunitTestProposal" question="/0/@parts.1/@tasks.2/@q" answer="/0/@parts.1/@tasks.2/@a" completion="0.5">
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1455746048789" completion="1.0" successCount="2"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1455746153166" completion="1.0" successCount="2"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1455746733740" completion="1.0" successCount="2"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1455746748593" completion="2.0" successCount="4"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1455746756910" completion="2.5" successCount="5" failureCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1455746888711" completion="3.0" successCount="6" failureCount="2"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1455747013372" completion="0.5" successCount="1" failureCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1455747052498" completion="0.5" successCount="1" failureCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1455747059686" completion="1.0" successCount="2" failureCount="2"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1455747076969" completion="1.5" successCount="3" failureCount="3"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1455747084139" completion="2.0" successCount="4" failureCount="4"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1455747166440" completion="0.5" successCount="1" failureCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1455747171125" completion="0.5" successCount="1" failureCount="1"/>
      </proposals>
    </proposals>
  </exercise:ExerciseProposals>
</xmi:XMI>
