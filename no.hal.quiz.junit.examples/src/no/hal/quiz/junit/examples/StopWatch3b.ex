<?xml version="1.0" encoding="UTF-8"?>
<xmi:XMI xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:exercise="platform:/plugin/no.hal.learning.exercise.model/model/exercise.ecore" xmlns:jdt="platform:/plugin/no.hal.learning.exercise.jdt/model/jdt-exercise.ecore">
  <exercise:Exercise>
    <parts xsi:type="exercise:ExercisePart" title="StopWatch">
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write source code for the StopWatch class."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="objectstructures.StopWatch"/>
      </tasks>
    </parts>
  </exercise:Exercise>
  <exercise:ExerciseProposals exercise="/0">
    <proposals exercisePart="/0/@parts.0">
      <proposals xsi:type="jdt:JdtSourceEditProposal" question="/0/@parts.0/@tasks.0/@q" answer="/0/@parts.0/@tasks.0/@a">
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1455873098842" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatch {&#xA;}&#xA;" sizeMeasure="4"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1455873119322" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatch {&#xA;&#x9;&#xA;&#x9;int ticks;&#xA;&#x9;&#xA;&#x9;public int getTicks() {&#xA;&#x9;&#x9;return ticks;&#xA;&#x9;}&#xA;}&#xA;" sizeMeasure="10"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1455873128572" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatch {&#xA;&#x9;&#xA;&#x9;int ticks;&#xA;&#x9;&#xA;&#x9;public long getTicks() {&#xA;&#x9;&#x9;return ticks;&#xA;&#x9;}&#xA;}&#xA;" sizeMeasure="10"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1455873135507" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatch {&#xA;&#x9;&#xA;&#x9;long ticks;&#xA;&#x9;&#xA;&#x9;public int getTicks() {&#xA;&#x9;&#x9;return ticks;&#xA;&#x9;}&#xA;}&#xA;" sizeMeasure="10" errorCount="1"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1455873164684" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatch {&#xA;&#x9;&#xA;&#x9;int ticks;&#xA;&#x9;&#xA;&#x9;public int getTicks() {&#xA;&#x9;&#x9;return ticks;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public void startWatch() {&#xA;&#x9;}&#xA;}&#xA;" sizeMeasure="13"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1455892804119" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatch {&#xA;&#x9;&#xA;&#x9;int ticks;&#xA;&#x9;&#xA;&#x9;public int getTicks() {&#xA;&#x9;&#x9;return ticks;&#xA;&#x9;}&#xA;&#x9;fdksl&#xA;&#x9;public void startWatch() {&#xA;&#x9;}&#xA;}&#xA;" sizeMeasure="13" errorCount="1"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1455893009594" sourceCode="package objectstructures;&#xA;&#xA;public class StopWatch {&#xA;&#x9;&#xA;&#x9;int ticks;&#xA;&#x9;&#xA;&#x9;public int getTicks() {&#xA;&#x9;&#x9;return ticks;&#xA;&#x9;}&#xA;&#xA;&#x9;public void startWatch() {&#xA;&#x9;}&#xA;}&#xA;" sizeMeasure="13"/>
      </proposals>
    </proposals>
  </exercise:ExerciseProposals>
</xmi:XMI>
