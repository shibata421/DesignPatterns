package br.com.cod3r.factory.apple.halfSimple.factory;

import br.com.cod3r.factory.apple.halfSimple.model.IPhone;
import br.com.cod3r.factory.apple.halfSimple.model.IPhoneX;
import br.com.cod3r.factory.apple.halfSimple.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

	@Override
	protected IPhone createIPhone(String level) {
		if (level.equalsIgnoreCase("standard")) {
			return new IPhoneX();
		} else if (level.equalsIgnoreCase("highend")) {
			return new IPhoneXSMax();
		} else {
			return null;
		}
	}

}
