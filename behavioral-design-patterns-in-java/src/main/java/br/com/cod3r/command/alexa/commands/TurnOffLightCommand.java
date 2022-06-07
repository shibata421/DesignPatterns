package br.com.cod3r.command.alexa.commands;

import br.com.cod3r.command.alexa.lights.SmartLight;

public class TurnOffLightCommand implements Command {

	private SmartLight light;

	public TurnOffLightCommand(SmartLight light) {
		this.light = light;
	}

	@Override
	public void execute() {
		this.light.turnOff();
	}

}
