package br.com.cod3r.prototype.deepShallow.model;

public class Address implements Cloneable {
	private String street;
	private Integer number;
	
	public Address(String street, Integer number) {
		this.street = street;
		this.number = number;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", number=" + number + "]";
	}

	@Override
	public Address clone() throws CloneNotSupportedException {
		return (Address) super.clone();
	}
}
