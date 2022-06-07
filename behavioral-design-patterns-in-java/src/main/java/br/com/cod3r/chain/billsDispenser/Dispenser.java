package br.com.cod3r.chain.billsDispenser;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Dispenser {

	private Bill chain;

	public Dispenser() {
		List<Bill> billList = Arrays.asList(BrazilianBills.values()).stream()
				.map(bill -> bill.getValue())
				.collect(Collectors.toList());
		organizeChain(billList);
	}
	
	public Dispenser(Bill...bills) {
		organizeChain(Arrays.asList(bills));
	}

	private void organizeChain(List<Bill> bills) {
		for (int i = 0; i < bills.size() - 1; i++) {
			bills.get(i).setNext(bills.get(i + 1));
		}
		
		this.chain = bills.get(0);
		
	}

	public void withdraw(Integer amount) {
		System.out.println("Calculating bills set for $" + amount);
		chain.execute(amount);
	}
}
