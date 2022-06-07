package br.com.cod3r.prototype.functionalCloneBuilder;

import br.com.cod3r.prototype.functionalCloneBuilder.model.Address;
import br.com.cod3r.prototype.functionalCloneBuilder.model.User;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		User user = new User("ToClone", 25, new Address("ABC Street", 1000));
		
		User userClone = user.cloneBuilder()
				.withAge(100)
				.now();
		
		Address addressClone = userClone.getAddress().cloneBuilder()
				.withStreet("Clone Avenue")
				.now();
		
		User userClone2 = userClone.cloneBuilder()
				.withAddress(addressClone)
				.now();
		
		System.out.println(user);
		System.out.println(userClone);
		System.out.println(userClone2);
	}
}