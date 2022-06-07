package br.com.cod3r.iterator.cart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cart implements Iterable<Product>{
	
	private List<Product> products;
	
	public Cart(Product... products) {
		this.products = new ArrayList<>();
		for (Product product : products) {
			this.products.add(product);			
		}
	}

	@Override
	public Iterator<Product> iterator() {
		return products.iterator();
	}
}
