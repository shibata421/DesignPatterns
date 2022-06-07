package br.com.cod3r.factory.apple.halfSimple.factory;

import br.com.cod3r.factory.apple.halfSimple.model.IPhone;
import br.com.cod3r.factory.apple.halfSimple.model.IPhone11;
import br.com.cod3r.factory.apple.halfSimple.model.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

	@Override
	protected IPhone createIPhone(String level) {
		if (level.equalsIgnoreCase("standard")) {
			return new IPhone11();
		} else if (level.equalsIgnoreCase("highend")) {
			return new IPhone11Pro();
		} else {
			return null;
		}
	}

}
