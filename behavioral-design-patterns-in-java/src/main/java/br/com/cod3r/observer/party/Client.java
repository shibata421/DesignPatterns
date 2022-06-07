package br.com.cod3r.observer.party;

import br.com.cod3r.observer.party.characters.Doorman;
import br.com.cod3r.observer.party.characters.PartyObserver;
import br.com.cod3r.observer.party.characters.Wife;

public class Client {

	public static void main(String[] args) {
		Doorman reception = new Doorman();
		PartyObserver gf = new Wife();
		PartyObserver friend = new Friend();
		PartyObserver friend2 = new Friend();
		PartyObserver mom = new Mom();
		reception.register(gf);
		reception.register(friend);
		reception.register(friend2);
		reception.register(mom);
		
		reception.mainEvent();
	}
}
