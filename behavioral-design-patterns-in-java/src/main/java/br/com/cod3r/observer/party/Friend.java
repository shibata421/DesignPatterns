package br.com.cod3r.observer.party;

import br.com.cod3r.observer.party.characters.PartyObserver;

public class Friend implements PartyObserver {

	@Override
	public void partyTime() {
		System.out.println("SURPRISE!!!");
	}

}
