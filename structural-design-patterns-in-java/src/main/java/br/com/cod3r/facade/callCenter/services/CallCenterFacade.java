package br.com.cod3r.facade.callCenter.services;

import java.util.List;

import br.com.cod3r.facade.callCenter.model.Card;
import br.com.cod3r.facade.callCenter.model.Register;

public class CallCenterFacade {

	private CardService cardService;
	private RegisterService registerService;
	private ReportService reportService;
	private PaymentService paymentService;
	private SecurityService securityService;

	public CallCenterFacade() {		
		cardService = new CardService();
		registerService = new RegisterService();
		reportService = new ReportService(registerService);
		paymentService = new PaymentService(registerService);
		securityService = new SecurityService(cardService, registerService);
	}
	
	public void getSummary(Card card) {
		reportService.getSumary(card);		
	}
	
	public void getPaymentInfoByCard(Card card) {
		paymentService.getPaymentInfoByCard(card);		
	}
	
	public void removeLastRegister(Card card) {
		List<Register> registers = registerService.getRegistersByCard(card);
		registerService.removeByIndex(card, registers.size() - 1);		
	}
	
	public void blockAndOrderNewCard(Card card) {
		List<Register> pendingRegisters = securityService.blockCard(card);		
		Card newCard = createNewCard(123456L, 33445566L);		
		registerService.addCardRegisters(newCard, pendingRegisters);
		getSummary(newCard);
	}
	
	public Card createNewCard(Long user, Long cardNumber) {
		return cardService.createNewCard(user, cardNumber);		
	}

	public Card getCardByUser(long l) {
		return cardService.getCardByUser(l);
	}
}
