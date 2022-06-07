package br.com.cod3r.adapter.tvPort.devices;

import br.com.cod3r.adapter.tvPort.intefaces.P2;

public class OldSoundSystem implements P2{

	private String model;

	public OldSoundSystem(String model) {
		this.model = model;
	}
	
	@Override
	public void setSound(String sound) {
		System.out.println(model + " >>> This is your sound " + sound);
	}

}
