package br.com.cod3r.iterator.cart;

import java.util.stream.StreamSupport;

public class Client {
	
	public static void main(String[] args) {
		Cart cart = new Cart(
				new Product("TV", 1000d), 
				new Product("Shoe", 59.99d), 
				new Product("Pencil", 0.5d));
		
		for (Product product : cart) {
			System.out.println(product);
		}
		
		Double sum = StreamSupport.stream(cart.spliterator(), false)
				.map(product -> product.getValue())
				.reduce(0.0, (acc, value) -> acc + value);
		System.out.println(sum);
	}
}
