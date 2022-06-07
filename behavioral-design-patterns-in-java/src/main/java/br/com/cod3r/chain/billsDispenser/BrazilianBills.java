package br.com.cod3r.chain.billsDispenser;

public enum BrazilianBills {

	DUZENTOS(new Bill(200)), CEM(new Bill(100)), CINQUENTA(new Bill(50)), VINTE(new Bill(20)), DEZ(new Bill(10)), CINCO(new Bill(5)), UM(new Bill(1));
	
	private Bill bill;
	
	private BrazilianBills(Bill bill) {
		this.bill = bill;
	}
	
	public Bill getValue() {
		return bill;
	}
}
