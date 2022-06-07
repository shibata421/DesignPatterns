package br.com.cod3r.mediator.translate;

import br.com.cod3r.mediator.translate.mediator.Mediator;
import br.com.cod3r.mediator.translate.mediator.TranslateMediator;
import br.com.cod3r.mediator.translate.model.EnglishUser;
import br.com.cod3r.mediator.translate.model.PortugueseUser;
import br.com.cod3r.mediator.translate.model.User;

public class Client {

	public static void main(String[] args) {
//		Mediator chatRoom = new ChatMediator();
		Mediator chatRoom = new TranslateMediator();
		
		User alan = new EnglishUser("Alan", chatRoom);
		User jose = new PortugueseUser("Jose", chatRoom);
		User sue = new EnglishUser("Sue", chatRoom);
		User maria = new PortugueseUser("Maria", chatRoom);
		
		chatRoom.addUser(alan);
		chatRoom.addUser(sue);
		chatRoom.addUser(maria);
		System.out.println();
		
		alan.sendMessage("Hello");
		System.out.println();
		maria.sendMessage("Oi", alan);
		System.out.println();
		
		chatRoom.removeUser(sue);
		System.out.println();
		
		alan.sendMessage("How are you?", maria);
		System.out.println();
		maria.sendMessage("Estou bem, obrigado.", alan);
		System.out.println();
		
		chatRoom.addUser(jose);
		System.out.println();
		
		jose.sendMessage("Oi");
		System.out.println();
		
		chatRoom.removeUser(maria);
	}
	
}