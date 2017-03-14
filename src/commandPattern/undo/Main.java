package commandPattern.undo;

import commandPattern.undo.ceilingFan.CeilingFan;
import commandPattern.undo.ceilingFan.CeilingFanHighCommand;
import commandPattern.undo.ceilingFan.CeilingFanMediumCommand;
import commandPattern.undo.ceilingFan.CeilingFanOffCommand;
import commandPattern.undo.light.Light;
import commandPattern.undo.light.LightOffCommand;
import commandPattern.undo.light.LightOnCommand;

public class Main {
 
	public static void main(String[] args) {
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

		//Light example
		Light livingRoomLight = new Light("Living Room");
 
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
 
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
 
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();

		//Ceiling example
		CeilingFan ceilingFan = new CeilingFan("Living Room");
   
		CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
  
		remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
		remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
   
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
  
		remoteControl.onButtonWasPushed(1);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
	}
}
