package br.com.cod3r.prototype.deepShallow.model;

public class User implements Cloneable {
	private String name;
	private Integer age;
	private Address address;
	
	public User(String name, Integer age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	@Override
	public User clone() throws CloneNotSupportedException {
		return (User) super.clone();
	}

	public User deepClone() throws CloneNotSupportedException {
		User userClone = (User) super.clone();
		userClone.address = address.clone();
		return userClone;
	}
}
