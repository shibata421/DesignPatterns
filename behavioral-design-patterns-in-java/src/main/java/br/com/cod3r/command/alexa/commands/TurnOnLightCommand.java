package br.com.cod3r.command.alexa.commands;

import br.com.cod3r.command.alexa.lights.SmartLight;

public class TurnOnLightCommand implements Command {

	private SmartLight light;
	
	public TurnOnLightCommand(SmartLight light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		this.light.turnOn();
	}

}
