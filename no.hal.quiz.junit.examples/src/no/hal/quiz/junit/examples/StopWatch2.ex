<?xml version="1.0" encoding="UTF-8"?>
<xmi:XMI xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:exercise="platform:/plugin/no.hal.learning.exercise.model/model/exercise.ecore" xmlns:jdt="platform:/plugin/no.hal.learning.exercise.jdt/model/jdt-exercise.ecore" xmlns:junit="platform:/plugin/no.hal.learning.exercise.junit/model/junit-exercise.ecore" xmlns:workbench="platform:/plugin/no.hal.learning.exercise.workbench/model/workbench-exercise.ecore">
  <exercise:Exercise>
    <parts xsi:type="exercise:ExercisePart" title="StopWatch and StopWatchManager">
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write source code for the StopWatch class."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="objectstructures.StopWatch"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write source code for the StopWatchManager class."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="objectstructures.StopWatchManager"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the StopWatchManagerTest."/>
        <a xsi:type="junit:JunitTestAnswer" testRunName="objectstructures.StopWatchManagerTest"/>
      </tasks>
    </parts>
    <parts xsi:type="exercise:ExercisePart" title="Tool usage">
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Use breakpoints to debug code."/>
        <a xsi:type="workbench:DebugEventAnswer" action="suspend.breakpoint"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Use the debug command Step Over"/>
        <a xsi:type="workbench:CommandExecutionAnswer" elementId="org.eclipse.debug.ui.commands.StepOver" action="executeSuccess"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Use the debug command Step Into"/>
        <a xsi:type="workbench:CommandExecutionAnswer" elementId="org.eclipse.debug.ui.commands.StepInto" action="executeSuccess"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Use the Variables view"/>
        <a xsi:type="workbench:PartTaskAnswer" elementId="org.eclipse.debug.ui.VariableView" action="activated"/>
      </tasks>
    </parts>
  </exercise:Exercise>
  <exercise:ExerciseProposals exercise="/0">
    <proposals exercisePart="/0/@parts.0">
      <proposals xsi:type="jdt:JdtSourceEditProposal" question="/0/@parts.0/@tasks.0/@q" answer="/0/@parts.0/@tasks.0/@a">
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1455801764820" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatch {&#xA;&#xA;}&#xA;" sizeMeasure="5"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1455833102915" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatch {&#xA;&#xA;}&#xA;&#xA;&#xA;/*&#xA;*/&#xA;" sizeMeasure="9"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1455837420671" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatch {&#xA;&#xA;}&#xA;/*&#xA;*/&#xA;" sizeMeasure="7"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1455837422650" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatch {&#xA;&#xA;}&#xA;/*&#xA;*/&#xA;&#xA;" sizeMeasure="8"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1455837443703" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatch {&#xA;&#xA;}&#xA;" sizeMeasure="5"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1455837552894" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatch {&#xA;&#xA;}&#xA;" sizeMeasure="5"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1455837558458" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatch {&#xA;" sizeMeasure="3" errorCount="1"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1455837565221" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatch {&#xA;}&#xA;" sizeMeasure="4"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1455873098840" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatch {&#xA;}&#xA;" sizeMeasure="4"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1455873119322" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatch {&#xA;&#x9;&#xA;&#x9;int ticks;&#xA;&#x9;&#xA;&#x9;public int getTicks() {&#xA;&#x9;&#x9;return ticks;&#xA;&#x9;}&#xA;}&#xA;" sizeMeasure="10"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1455873128571" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatch {&#xA;&#x9;&#xA;&#x9;int ticks;&#xA;&#x9;&#xA;&#x9;public long getTicks() {&#xA;&#x9;&#x9;return ticks;&#xA;&#x9;}&#xA;}&#xA;" sizeMeasure="10"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1455873135507" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatch {&#xA;&#x9;&#xA;&#x9;long ticks;&#xA;&#x9;&#xA;&#x9;public int getTicks() {&#xA;&#x9;&#x9;return ticks;&#xA;&#x9;}&#xA;}&#xA;" sizeMeasure="10" errorCount="1"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1455873164683" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatch {&#xA;&#x9;&#xA;&#x9;int ticks;&#xA;&#x9;&#xA;&#x9;public int getTicks() {&#xA;&#x9;&#x9;return ticks;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public void startWatch() {&#xA;&#x9;}&#xA;}&#xA;" sizeMeasure="13"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1455892804118" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatch {&#xA;&#x9;&#xA;&#x9;int ticks;&#xA;&#x9;&#xA;&#x9;public int getTicks() {&#xA;&#x9;&#x9;return ticks;&#xA;&#x9;}&#xA;&#x9;fdksl&#xA;&#x9;public void startWatch() {&#xA;&#x9;}&#xA;}&#xA;" sizeMeasure="13" errorCount="1"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1455893009594" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatch {&#xA;&#x9;&#xA;&#x9;int ticks;&#xA;&#x9;&#xA;&#x9;public int getTicks() {&#xA;&#x9;&#x9;return ticks;&#xA;&#x9;}&#xA;&#xA;&#x9;public void startWatch() {&#xA;&#x9;}&#xA;}&#xA;" sizeMeasure="13"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1456497078309" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatch {&#xA;&#x9;&#xA;&#x9;int ticks;&#xA;&#x9;&#xA;&#x9;public int getTicks() {&#xA;&#x9;&#x9;return ticks;&#xA;&#x9;}&#xA;&#xA;&#x9;public void startWatch() {&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;// her kommer det mer&#xA;}&#xA;" sizeMeasure="15"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1456497100378" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatch {&#xA;&#x9;&#xA;&#x9;int ticks;&#xA;&#x9;&#xA;&#x9;public int getTicks() {&#xA;&#x9;&#x9;return ticks;&#xA;&#x9;}&#xA;&#xA;&#x9;public void startWatch() {&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;// her kommer det mer etterhvert&#xA;}&#xA;" sizeMeasure="15"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1456751117427" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatch {&#xA;&#x9;&#xA;&#x9;int ticks;&#xA;&#x9;&#xA;&#x9;public int getTicks() {&#xA;&#x9;&#x9;return ticks;&#xA;&#x9;}&#xA;&#xA;&#x9;public void startWatch() {&#xA;&#x9;}&#xA;}&#xA;" sizeMeasure="13"/>
      </proposals>
      <proposals xsi:type="jdt:JdtSourceEditProposal" question="/0/@parts.0/@tasks.1/@q" answer="/0/@parts.0/@tasks.1/@a">
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1455833079906" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatchManager {&#xA;&#xA;}&#xA;" sizeMeasure="5"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1455833083878" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatchManager {&#xA;&#xA;}&#xA;" sizeMeasure="5"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1455837580302" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatchManager {&#xA;&#xA;}&#xA;/*&#xA; * &#xA; * denne blir større og større&#xA; * &#xA; */&#xA;" sizeMeasure="10"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1456497158273" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatchManager {&#xA;&#x9;&#xA;&#x9;// her kommer det mer etterhvert&#xA;&#xA;}&#xA;/*&#xA; * &#xA; * denne blir større og større&#xA; * &#xA; */&#xA;" sizeMeasure="12"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1456497261431" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatchManager {&#xA;&#x9;&#xA;&#x9;// her kommer det mer etterhvert&#xA;&#xA;}&#xA;" sizeMeasure="7"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1456592480607" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatchManager {&#xA;&#x9;&#xA;&#x9;// her kommer det mer etterhvert&#xA;&#x9;// her kommer det mer etterhvert&#xA;&#xA;}&#xA;" sizeMeasure="8"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1456592790917" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatchManager {&#xA;&#x9;&#xA;&#x9;// her kommer det mer etterhvert&#xA;&#x9;// her kommer det mer etterhvert&#xA;&#x9;// her kommer det mer etterhvert&#xA;&#xA;}&#xA;" sizeMeasure="9"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1456592837665" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatchManager {&#xA;&#x9;&#xA;&#x9;// her kommer det mer etterhvert&#xA;&#x9;// her kommer det mer etterhvert&#xA;&#x9;// her kommer det mer etterhvert&#xA;&#x9;// her kommer det mer etterhvert&#xA;&#xA;}&#xA;" sizeMeasure="10"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1456599333632" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatchManager {&#xA;&#x9;&#xA;&#x9;// her kommer det mer etterhvert&#xA;&#x9;// her kommer det mer etterhvert&#xA;&#x9;// her kommer det mer etterhvert&#xA;&#x9;// her kommer det mer etterhvert&#xA;&#x9;// her kommer det mer etterhvert&#xA;&#xA;}&#xA;" sizeMeasure="11"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1456740016768" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatchManager {&#xA;&#x9;&#xA;&#x9;// her kommer det mer etterhvert&#xA;&#x9;// her kommer det mer etterhvert&#xA;&#x9;// her kommer det mer etterhvert&#xA;&#x9;// her kommer det mer etterhvert&#xA;&#x9;// her kommer det mer etterhvert&#xA;}&#xA;" sizeMeasure="10"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1456751078639" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatchManager {&#xA;&#x9;&#xA;}&#xA;" sizeMeasure="5"/>
      </proposals>
      <proposals xsi:type="junit:JunitTestProposal" question="/0/@parts.0/@tasks.2/@q" answer="/0/@parts.0/@tasks.2/@a" completion="0.6666666666666666">
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1455803242159" completion="1.0" successCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1455838739841" completion="1.0" successCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1456494852534" completion="1.0" successCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1456496435466" completion="1.0" successCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1456496585226" completion="1.0" successCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1456496730052" completion="1.0" successCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1456496876357" completion="1.0" successCount="2"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1456497038490" completion="1.0" successCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1456497108192" completion="1.0" successCount="2"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1456497194024" completion="1.0" successCount="3"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1456497298736" completion="0.8" successCount="4" failureCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1456497342474" completion="0.75" successCount="6" failureCount="2"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1456748904778" completion="0.6666666666666666" successCount="2" failureCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1456750858107" completion="0.6666666666666666" successCount="2" failureCount="1"/>
      </proposals>
    </proposals>
    <proposals exercisePart="/0/@parts.1">
      <proposals xsi:type="workbench:DebugEventProposal" question="/0/@parts.1/@tasks.0/@q" answer="/0/@parts.1/@tasks.0/@a"/>
      <proposals xsi:type="workbench:CommandExecutionProposal" question="/0/@parts.1/@tasks.1/@q" answer="/0/@parts.1/@tasks.1/@a"/>
      <proposals xsi:type="workbench:CommandExecutionProposal" question="/0/@parts.1/@tasks.2/@q" answer="/0/@parts.1/@tasks.2/@a"/>
      <proposals xsi:type="workbench:PartTaskProposal" question="/0/@parts.1/@tasks.3/@q" answer="/0/@parts.1/@tasks.3/@a"/>
    </proposals>
  </exercise:ExerciseProposals>
</xmi:XMI>
