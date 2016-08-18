<?xml version="1.0" encoding="UTF-8"?>
<xmi:XMI xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:exercise="platform:/plugin/no.hal.learning.exercise.model/model/exercise.ecore" xmlns:jdt="platform:/plugin/no.hal.learning.exercise.jdt/model/jdt-exercise.ecore" xmlns:junit="platform:/plugin/no.hal.learning.exercise.junit/model/junit-exercise.ecore" xmlns:workbench="platform:/plugin/no.hal.learning.exercise.workbench/model/workbench-exercise.ecore">
  <exercise:Exercise>
    <parts xsi:type="exercise:ExercisePart" title="TrafficLight and TrafficLightController">
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write source code for the TrafficLightControllerTest class."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="testing.TrafficLightControllerTest"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write source code for the TrafficLightController class."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="testing.TrafficLightController"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the TrafficLightController class."/>
        <a xsi:type="jdt:JdtLaunchAnswer" className="testing.TrafficLightController"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the TrafficLightControllerTest."/>
        <a xsi:type="junit:JunitTestAnswer" testRunName="testing.TrafficLightControllerTest"/>
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
    </parts>
  </exercise:Exercise>
  <exercise:ExerciseProposals exercise="/0">
    <proposals exercisePart="/0/@parts.0">
      <proposals xsi:type="jdt:JdtSourceEditProposal" question="/0/@parts.0/@tasks.0/@q" answer="/0/@parts.0/@tasks.0/@a"/>
      <proposals xsi:type="jdt:JdtSourceEditProposal" question="/0/@parts.0/@tasks.1/@q" answer="/0/@parts.0/@tasks.1/@a">
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1456928209394" sourceCode="package testing;&#xA;&#xA;public class TrafficLightController implements ITrafficLightController {&#xA;&#xA;&#x9;private TrafficLight carLights, pedLights;&#xA;&#x9;private int stateNum = 0;&#xA;&#xA;&#x9;public TrafficLightController() {&#xA;&#x9;&#x9;this.carLights = new TrafficLight(TrafficLight.RED, TrafficLight.YELLOW, TrafficLight.GREEN);&#xA;&#x9;&#x9;this.pedLights = new TrafficLight(TrafficLight.RED, TrafficLight.GREEN);&#xA;&#x9;&#x9;enterState(0);&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;private void enterState(int stateNum) {&#xA;&#x9;&#x9;this.stateNum = stateNum;&#xA;&#x9;&#x9;switch (stateNum) {&#xA;&#x9;&#x9;case 0:&#xA;&#x9;&#x9;&#x9;this.carLights.setState(true, TrafficLight.GREEN);&#xA;&#x9;&#x9;&#x9;this.carLights.setState(false, TrafficLight.RED, TrafficLight.YELLOW);&#xA;&#x9;&#x9;&#x9;this.pedLights.setState(true, TrafficLight.RED);&#xA;&#x9;&#x9;&#x9;this.pedLights.setState(false, TrafficLight.GREEN);&#xA;&#x9;&#x9;&#x9;break;&#xA;&#x9;&#x9;case 1:&#xA;&#x9;&#x9;&#x9;this.carLights.toggleState(TrafficLight.GREEN, TrafficLight.YELLOW);&#xA;&#x9;&#x9;&#x9;break;&#xA;&#x9;&#x9;case 2:&#xA;&#x9;&#x9;&#x9;this.carLights.toggleState(TrafficLight.YELLOW, TrafficLight.RED);&#xA;&#x9;&#x9;&#x9;this.pedLights.toggleState(TrafficLight.GREEN, TrafficLight.RED);&#xA;&#x9;&#x9;&#x9;break;&#xA;&#x9;&#x9;case 3:&#xA;&#x9;&#x9;&#x9;this.carLights.toggleState(TrafficLight.YELLOW);&#xA;&#x9;&#x9;&#x9;this.pedLights.toggleState(TrafficLight.GREEN, TrafficLight.RED);&#xA;&#x9;&#x9;&#x9;break;&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#xA;&#x9;@Override&#xA;&#x9;public boolean isCarLight(boolean state, String... lights) {&#xA;&#x9;&#x9;return carLights.isState(state, lights);&#xA;&#x9;}&#xA;&#xA;&#x9;@Override&#xA;&#x9;public boolean isPedLight(boolean state, String... lights) {&#xA;&#x9;&#x9;return pedLights.isState(state, lights);&#xA;&#x9;}&#xA;&#xA;&#x9;@Override&#xA;&#x9;public void tick() {&#xA;&#x9;&#x9;if (stateNum > 0) {&#xA;&#x9;&#x9;&#x9;enterState((stateNum + 1) % 4);&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public void pedButton() {&#xA;&#x9;&#x9;if (stateNum == 0) {&#xA;&#x9;&#x9;&#x9;enterState(1);&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public static void main(String[] args) {&#xA;&#x9;&#x9;System.out.println(TrafficLightController.class);&#xA;&#x9;}&#xA;}&#xA;" sizeMeasure="64"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1456928227511" sourceCode="package testing;&#xA;&#xA;public class TrafficLightController implements ITrafficLightController {&#xA;&#xA;&#x9;private TrafficLight carLights, pedLights;&#xA;&#x9;private int stateNum = 0;&#xA;&#xA;&#x9;public TrafficLightController() {&#xA;&#x9;&#x9;this.carLights = new TrafficLight(TrafficLight.RED, TrafficLight.YELLOW, TrafficLight.GREEN);&#xA;&#x9;&#x9;this.pedLights = new TrafficLight(TrafficLight.RED, TrafficLight.GREEN);&#xA;&#x9;&#x9;enterState(0);&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;private void enterState(int stateNum) {&#xA;&#x9;&#x9;this.stateNum = stateNum;&#xA;&#x9;&#x9;// assumes the previous state is stateNum - 1&#xA;&#x9;&#x9;switch (stateNum) {&#xA;&#x9;&#x9;case 0:&#xA;&#x9;&#x9;&#x9;this.carLights.setState(true, TrafficLight.GREEN);&#xA;&#x9;&#x9;&#x9;this.carLights.setState(false, TrafficLight.RED, TrafficLight.YELLOW);&#xA;&#x9;&#x9;&#x9;this.pedLights.setState(true, TrafficLight.RED);&#xA;&#x9;&#x9;&#x9;this.pedLights.setState(false, TrafficLight.GREEN);&#xA;&#x9;&#x9;&#x9;break;&#xA;&#x9;&#x9;case 1:&#xA;&#x9;&#x9;&#x9;this.carLights.toggleState(TrafficLight.GREEN, TrafficLight.YELLOW);&#xA;&#x9;&#x9;&#x9;break;&#xA;&#x9;&#x9;case 2:&#xA;&#x9;&#x9;&#x9;this.carLights.toggleState(TrafficLight.YELLOW, TrafficLight.RED);&#xA;&#x9;&#x9;&#x9;this.pedLights.toggleState(TrafficLight.GREEN, TrafficLight.RED);&#xA;&#x9;&#x9;&#x9;break;&#xA;&#x9;&#x9;case 3:&#xA;&#x9;&#x9;&#x9;this.carLights.toggleState(TrafficLight.YELLOW);&#xA;&#x9;&#x9;&#x9;this.pedLights.toggleState(TrafficLight.GREEN, TrafficLight.RED);&#xA;&#x9;&#x9;&#x9;break;&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#xA;&#x9;@Override&#xA;&#x9;public boolean isCarLight(boolean state, String... lights) {&#xA;&#x9;&#x9;return carLights.isState(state, lights);&#xA;&#x9;}&#xA;&#xA;&#x9;@Override&#xA;&#x9;public boolean isPedLight(boolean state, String... lights) {&#xA;&#x9;&#x9;return pedLights.isState(state, lights);&#xA;&#x9;}&#xA;&#xA;&#x9;@Override&#xA;&#x9;public void tick() {&#xA;&#x9;&#x9;if (stateNum > 0) {&#xA;&#x9;&#x9;&#x9;enterState((stateNum + 1) % 4);&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public void pedButton() {&#xA;&#x9;&#x9;if (stateNum == 0) {&#xA;&#x9;&#x9;&#x9;enterState(1);&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public static void main(String[] args) {&#xA;&#x9;&#x9;System.out.println(TrafficLightController.class);&#xA;&#x9;}&#xA;}&#xA;" sizeMeasure="65"/>
      </proposals>
      <proposals xsi:type="jdt:JdtLaunchProposal" question="/0/@parts.0/@tasks.2/@q" answer="/0/@parts.0/@tasks.2/@a">
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1456837493937" mode="run"/>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1456837900933" mode="run"/>
      </proposals>
      <proposals xsi:type="junit:JunitTestProposal" question="/0/@parts.0/@tasks.3/@q" answer="/0/@parts.0/@tasks.3/@a"/>
    </proposals>
    <proposals exercisePart="/0/@parts.1">
      <proposals xsi:type="workbench:DebugEventProposal" question="/0/@parts.1/@tasks.0/@q" answer="/0/@parts.1/@tasks.0/@a"/>
      <proposals xsi:type="workbench:CommandExecutionProposal" question="/0/@parts.1/@tasks.1/@q" answer="/0/@parts.1/@tasks.1/@a"/>
      <proposals xsi:type="workbench:CommandExecutionProposal" question="/0/@parts.1/@tasks.2/@q" answer="/0/@parts.1/@tasks.2/@a"/>
    </proposals>
  </exercise:ExerciseProposals>
</xmi:XMI>
