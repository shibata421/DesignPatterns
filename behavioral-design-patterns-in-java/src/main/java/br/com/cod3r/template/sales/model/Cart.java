package br.com.cod3r.template.sales.model;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Cart implements Iterable<Product>{
	
	private Buyer buyer;
	private List<Product> items;
	
	public Cart(Buyer buyer, List<Product> items) {
		this.buyer = buyer;
		this.items = items;
	}

	public Buyer getBuyer() {
		return buyer;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}

	public List<Product> getItems() {
		return Collections.unmodifiableList(items);
	}
	
	public Double getTotalValue() {
		return items.stream()
				.map(product -> product.getValue())
				.reduce(0.0, (acc, value) -> acc += value);
	}
	
	public Double getTotalWeight() {
		return items.stream()
				.map(product -> product.getWeight())
				.reduce(0.0, (acc, weight) -> acc += weight);
	}

	@Override
	public Iterator<Product> iterator() {
		return items.iterator();
	}
}
