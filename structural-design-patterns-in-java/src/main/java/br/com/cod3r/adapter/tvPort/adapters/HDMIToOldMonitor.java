package br.com.cod3r.adapter.tvPort.adapters;

import br.com.cod3r.adapter.tvPort.devices.OldMonitor;
import br.com.cod3r.adapter.tvPort.intefaces.HDMI;

public class HDMIToOldMonitor extends OldMonitor implements HDMI {
	
	public HDMIToOldMonitor(String model) {
		super(model);
	}

	@Override
	public void setImage(String image) {
		System.out.println("Converting HDMI to OldMonitor....");
		super.setImage(image);
	}

	@Override
	public void setSound(String sound) {
		System.out.println("Sorry, no sound for you");
	}

}
