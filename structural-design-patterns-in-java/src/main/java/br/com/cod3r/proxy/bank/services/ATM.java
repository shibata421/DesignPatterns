package br.com.cod3r.proxy.bank.services;

public class ATM implements BankOperations {

	private BankOperations bankOperations;

	public ATM(BankOperations bankOperations) {
		this.bankOperations = bankOperations;
	}
	
	@Override
	public void deposit(Long account, Long amount) {
		bankOperations.deposit(account, amount);
	}

	@Override
	public void withdraw(Long account, String passwd, Long amount) {
		if (amount > 300) {
			System.out.println("Your are not allowed to withdraw more than 300 here");
		} else {
			bankOperations.withdraw(account, passwd, amount);
		}
	}

	@Override
	public void changePassword(Long account, String oldPassword, String newPassword) {
		System.out.println("ATM cannot perform this operation");
	}

}
