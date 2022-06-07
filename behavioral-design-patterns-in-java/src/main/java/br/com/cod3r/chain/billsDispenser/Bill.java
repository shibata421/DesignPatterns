package br.com.cod3r.chain.billsDispenser;

public class Bill {

	private int value;
	private Bill next;

	public Bill(int value) {
		this.value = value;
	}

	public Bill(int value, Bill next) {
		this.value = value;
		this.next = next;
	}

	public void execute(int remaining) {
		if (remaining >= value) {
			int bills = remaining / value;
			remaining %= value;
			System.out.println(String.format("- %d bill(s) of $%d, $%d remaining", bills, value, remaining));
		}

		if (remaining == 0) {
			return;
		}
		
		if (next != null) {
			next.execute(remaining);
		}
	}
	
	public void setNext(Bill next) {
		this.next = next;
	}
}
