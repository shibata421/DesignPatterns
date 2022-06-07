package br.com.cod3r.template.sales.template;

import br.com.cod3r.template.sales.model.Cart;

public abstract class PriceTemplate {
	
	protected Double regularItemsPrice;
	protected Double deliveryTax;
	protected Cart cart;
	
	public PriceTemplate(Cart cart) {
		this.cart = cart;
		this.regularItemsPrice = cart.getTotalValue();
		this.deliveryTax = calculateDeliveryTax(cart);
	}

	public Double calculateOffer(Double oldPrice) {
		Double newPrice = Double.MAX_VALUE;
		if(isAppliable()) {
			newPrice = calculateOffer();			
		}
		
		if(newPrice < oldPrice) {
			return newPrice;
		}
		return oldPrice;
	}
	
	private Double calculateDeliveryTax(Cart cart) {
		Integer distance = cart.getBuyer().getDistance();
		return (distance * cart.getTotalWeight()) / 100;
	}
	
	protected abstract Double calculateOffer();
	protected abstract boolean isAppliable();
}
