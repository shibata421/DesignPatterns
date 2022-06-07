package br.com.cod3r.adapter.tvPort;

import br.com.cod3r.adapter.tvPort.adapters.HDMIToOldMonitor;
import br.com.cod3r.adapter.tvPort.adapters.HDMIToVGAAdapter;
import br.com.cod3r.adapter.tvPort.devices.Computer;
import br.com.cod3r.adapter.tvPort.devices.OldMonitor;
import br.com.cod3r.adapter.tvPort.devices.OldSoundSystem;
import br.com.cod3r.adapter.tvPort.devices.TV;

public class Client {

	public static void main(String[] args) {
		Computer pc = new Computer();
		TV tv = new TV();
		pc.connectPort(tv);
		pc.sendImageAndSound("Cat and rainbow", "Nyan cat song");
		
		System.out.println("------ Monitor ----------");
		Computer pc2 = new Computer();
		OldMonitor monitor = new OldMonitor("Sony monitor");
		OldSoundSystem soundSystem = new OldSoundSystem("LG sound system");
		HDMIToVGAAdapter adapter = new HDMIToVGAAdapter.Builder()
				.withVGADevice(monitor)
				.withP2Device(soundSystem)
				.now();
		pc2.connectPort(adapter);
		pc2.sendImageAndSound("Cat and rainbow", "Nyan cat song");

		System.out.println("------ Monitor Class Adapter ----------");
		Computer pc3 = new Computer();
		HDMIToOldMonitor strangeMonitor = new HDMIToOldMonitor("Samsung strange monitor"); 
		pc3.connectPort(strangeMonitor);
		pc3.sendImageAndSound("Cat and rainbow", "Nyan cat song");
		

	}
}
