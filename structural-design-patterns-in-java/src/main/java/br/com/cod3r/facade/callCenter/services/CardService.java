package br.com.cod3r.facade.callCenter.services;

import java.util.HashMap;
import java.util.Map;

import br.com.cod3r.facade.callCenter.model.Card;

public class CardService {
	private Map<Long, Card> memory;
	
	CardService() {
		memory = new HashMap<>();
		memory.put(123456L, new Card(123456L, 11223344L));
	}

	Card getCardByUser(Long l) {
		return memory.get(l);
	}
	
	void removeCard(Card card) {
		memory.remove(card.getUserNumber());
	}
	
	Card createNewCard(Long user, Long cardNumber) {
		System.out.println("-----------CREATE-------------");
		Card newCard = new Card(user, cardNumber);
		memory.put(user, newCard);
		System.out.println("Creating the new card: " + newCard);
		return newCard;
	}

}
