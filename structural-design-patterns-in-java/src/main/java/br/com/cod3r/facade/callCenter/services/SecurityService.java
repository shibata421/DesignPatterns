package br.com.cod3r.facade.callCenter.services;

import java.util.List;

import br.com.cod3r.facade.callCenter.model.Card;
import br.com.cod3r.facade.callCenter.model.Register;

public class SecurityService {
	private CardService cardService;
	private RegisterService registerService;
	
	SecurityService(CardService cardService, RegisterService registerService) {
		this.cardService = cardService;
		this.registerService = registerService;
	}

	List<Register> blockCard(Card card) {
		System.out.println("-----------BLOCK-------------");
		System.out.println("Blocking card:" + card);
		List<Register> pendingRegistries = registerService.getRegistersByCard(card);
		cardService.removeCard(card);
		registerService.deleteCardRegistries(card);
		return pendingRegistries;
	}
}
