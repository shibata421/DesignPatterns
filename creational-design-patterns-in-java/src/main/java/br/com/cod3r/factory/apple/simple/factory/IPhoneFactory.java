package br.com.cod3r.factory.apple.simple.factory;

import br.com.cod3r.factory.apple.simple.model.IPhone;
import br.com.cod3r.factory.apple.simple.model.IPhone11;
import br.com.cod3r.factory.apple.simple.model.IPhone11Pro;
import br.com.cod3r.factory.apple.simple.model.IPhoneX;
import br.com.cod3r.factory.apple.simple.model.IPhoneXSMax;

public class IPhoneFactory {

	public static IPhone createIphone(String model, String level) {
		IPhone device = null;

		if ("x".equalsIgnoreCase(model)) {
			if ("standard".equalsIgnoreCase(level)) {
				device = new IPhoneX();
			} else if ("highend".equalsIgnoreCase(level)) {
				device = new IPhoneXSMax();
			}
		} else if ("11".equalsIgnoreCase(model)) {
			if ("standard".equalsIgnoreCase(level)) {
				device = new IPhone11();
			} else if ("highend".equalsIgnoreCase(level)) {
				device = new IPhone11Pro();
			}
		}

		if (device != null) {
			device.getHardware();
			device.assemble();
			device.certificates();
			device.pack();
		}

		return device;
	}

}
