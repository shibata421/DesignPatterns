package br.com.cod3r.command.alexa.alexa;

import java.util.HashMap;
import java.util.Map;

import br.com.cod3r.command.alexa.commands.Command;
import br.com.cod3r.command.alexa.commands.TurnOffLightCommand;
import br.com.cod3r.command.alexa.commands.TurnOnLightCommand;
import br.com.cod3r.command.alexa.lights.PhillipsHueLight;
import br.com.cod3r.command.alexa.lights.SmartLight;
import br.com.cod3r.command.alexa.lights.XiaomiLight;

public class Alexa {
	
	private Map<String, Command> integrations;
	
	public Alexa() {
		integrations = new HashMap<>();
		
		SmartLight phillips = new PhillipsHueLight();
		SmartLight xiaomi = new XiaomiLight();
		
		integrations.put("Turn on the Living room light", new TurnOnLightCommand(phillips));
		integrations.put("Turn off the Living room light", new TurnOffLightCommand(phillips));
		integrations.put("Turn on the Kitchen light", new TurnOnLightCommand(xiaomi));
		integrations.put("Turn off the Kitchen light", new TurnOffLightCommand(xiaomi));
	}

	public void sendRequest(String request) {
		try {
			Command command = integrations.get(request);
			command.execute();
		} catch (Exception e) {
			System.out.println("Sorry, I can't perform your request!");
		}	 
	}
}
