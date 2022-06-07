package br.com.cod3r.facade.callCenter.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.cod3r.facade.callCenter.model.Card;
import br.com.cod3r.facade.callCenter.model.Register;

public class RegisterService {
	private Map<Long, List<Register>> memory;
	
	RegisterService() {
		memory = new HashMap<Long, List<Register>>();
		memory.put(11223344L, new ArrayList<>(Arrays.asList(
				new Register("McDonalds", 15d, new Date()),
				new Register("Pizza Hut", 25d, new Date()),
				new Register("Nike Store", 50d, new Date())
			)));
	}

	List<Register> getRegistersByCard(Card card) {
		return memory.get(card.getCardNumber());
	}

	void removeByIndex(Card card, int i) {
		System.out.println("-----------REMOVE-------------");
		List<Register> list = memory.get(card.getCardNumber());
		Register reg = list.remove(i);
		System.out.println(reg.toString() + " Deleted!");
		memory.put(card.getCardNumber(), list);
	}

	void deleteCardRegistries(Card card) {
		memory.remove(card.getCardNumber());
	}
	
	void addCardRegisters(Card card, List<Register> registers) {
		System.out.println("Associating pending Registers to new Card!");
		memory.put(card.getCardNumber(), registers);
	}
}
