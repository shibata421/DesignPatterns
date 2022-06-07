package br.com.cod3r.observer.party.characters;

import java.util.Collection;
import java.util.HashSet;

public class Doorman {
	
	private Collection<PartyObserver> partyObservers;
	
	public Doorman() {
		this.partyObservers = new HashSet<>();
	}
	
	public void mainEvent() {
		partyObservers.forEach(o -> o.partyTime());
	}

	public void register(PartyObserver observer) {
		this.partyObservers.add(observer);
	}
}
