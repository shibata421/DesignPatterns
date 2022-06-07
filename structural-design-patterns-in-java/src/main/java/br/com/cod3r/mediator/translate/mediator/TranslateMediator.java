package br.com.cod3r.mediator.translate.mediator;

import br.com.cod3r.mediator.translate.model.User;
import br.com.cod3r.mediator.translate.services.Translator;

public class TranslateMediator extends Mediator {

	private Translator translator = new Translator();
	
	@Override
	protected String getMessage(String message, User to, User from) {
		String translatedMessage = translator.getTranslation(from.getLanguage(), to.getLanguage(), message);
		return translatedMessage;
	}

}
