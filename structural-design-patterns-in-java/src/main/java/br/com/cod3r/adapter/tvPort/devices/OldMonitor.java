package br.com.cod3r.adapter.tvPort.devices;

import br.com.cod3r.adapter.tvPort.intefaces.VGA;

public class OldMonitor implements VGA {
	
	private String model;

	public OldMonitor(String model) {
		this.model = model;
	}
	
	@Override
	public void setImage(String image) {
		System.out.println(model + " >>> This is your video: " + image);
	}
	
}
