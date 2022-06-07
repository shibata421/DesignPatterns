package br.com.cod3r.facade.callCenter;

import br.com.cod3r.facade.callCenter.model.Card;
import br.com.cod3r.facade.callCenter.services.CallCenterFacade;

public class Client {

	public static void main(String[] args) {
		CallCenterFacade facade = new CallCenterFacade();
		
		Card card = facade.getCardByUser(123456L);
		System.out.println(card);
		
		facade.getSummary(card);
		
		facade.getPaymentInfoByCard(card);
		
		//Remove last register, block the card and order a new one
		facade.removeLastRegister(card);
		facade.blockAndOrderNewCard(card);
	}
}
