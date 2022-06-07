package br.com.cod3r.proxy.bank.services;

import java.util.HashMap;
import java.util.Map;

import br.com.cod3r.proxy.bank.model.User;

public class Bank implements BankOperations {
	private Map<Long, User> userDatabase;
	
	public Bank() {
		userDatabase = new HashMap<>();
		userDatabase.put(123L, new User("User #1", 123L, "1234", 1000L));
		userDatabase.put(456L, new User("User #2", 456L, "9999", 200L));
	}

	@Override
	public void deposit(Long account, Long amount) {
		User user = getUser(account);
		
		user.setBalance(user.getBalance() + amount);
		System.out.println(String.format("%s +%d. New Balance: %d", 
				user.getName(), amount, user.getBalance()));
	}

	private User getUser(Long account) {
		User user = userDatabase.get(account);
		
		if(user == null) {
			System.out.println("Invalid account");
		}
		
		return user;
	}

	@Override
	public void withdraw(Long account, String passwd, Long amount) {
		User user = getUser(account);
		
		testPassword(passwd, user);
		
		if(user.getBalance() < amount) {
			System.out.println("You don't have enough resources");
		}
		
		user.setBalance(user.getBalance() - amount);
		System.out.println(String.format("%s -%d. New Balance: %d", 
				user.getName(), amount, user.getBalance()));
	}

	private void testPassword(String passwd, User user) {
		if(!user.getPassword().equals(passwd)) {
			System.out.println("Wrong password");
		}
	}

	@Override
	public void changePassword(Long account, String oldPassword, String newPassword) {
		User user = getUser(account);
		
		testPassword(oldPassword, user);
		
		user.setPassword(newPassword);
		System.out.println(String.format("%s's password updated successfuly!", 
				user.getName()));
	}

}
