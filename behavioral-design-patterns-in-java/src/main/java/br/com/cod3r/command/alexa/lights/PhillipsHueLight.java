package br.com.cod3r.command.alexa.lights;

public class PhillipsHueLight implements SmartLight{
	
	@Override
	public void turnOn() {
		System.out.println("The PhillipsHueLight is On");
	}
	
	@Override
	public void turnOff() {
		System.out.println("The PhillipsHueLight is Off");
	}
}
