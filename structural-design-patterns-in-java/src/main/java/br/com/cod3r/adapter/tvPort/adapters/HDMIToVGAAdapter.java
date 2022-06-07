package br.com.cod3r.adapter.tvPort.adapters;

import br.com.cod3r.adapter.tvPort.intefaces.HDMI;
import br.com.cod3r.adapter.tvPort.intefaces.P2;
import br.com.cod3r.adapter.tvPort.intefaces.VGA;

public class HDMIToVGAAdapter implements HDMI {

	private final VGA vgaDevice;
	private final P2 p2Device;

	private HDMIToVGAAdapter(VGA vgaDevice, P2 p2Device) {
		this.vgaDevice = vgaDevice;
		this.p2Device = p2Device;
	}

	@Override
	public void setImage(String image) {
		if (vgaDevice == null) {
			System.out.println("Sorry, no image for you");			
		} else {
			System.out.println("Converting HDMI Image to VGA...");
			vgaDevice.setImage(image);			
		}
	}

	@Override
	public void setSound(String sound) {
		if (p2Device == null) {
			System.out.println("Sorry, no sound for you");			
		} else {
			System.out.println("Converting HDMI Sound to P2...");
			p2Device.setSound(sound);			
		}
	}
	
	public static class Builder {

		private VGA vgaDevice;
		private P2 p2Device;
		
		public Builder() {}
		
		public Builder withVGADevice(VGA vgaDevice) {
			this.vgaDevice = vgaDevice;
			return this;
		}
		
		public Builder withP2Device(P2 p2Device) {
			this.p2Device = p2Device;
			return this;
		}
		
		public HDMIToVGAAdapter now() {
			return new HDMIToVGAAdapter(vgaDevice, p2Device);
		}
	}
}
