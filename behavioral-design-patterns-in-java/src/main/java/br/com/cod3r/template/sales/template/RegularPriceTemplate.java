package br.com.cod3r.template.sales.template;

import br.com.cod3r.template.sales.model.Cart;

public class RegularPriceTemplate extends PriceTemplate {

	public RegularPriceTemplate(Cart cart) {
		super(cart);
	}

	@Override
	protected Double calculateOffer() {
		System.out.println(String.format("Regular Items Price: %.2f", super.regularItemsPrice));
		System.out.println(String.format("Delivery Tax: %.2f", super.deliveryTax));
		
		Double currentPrice = regularItemsPrice + deliveryTax;
		System.out.println(String.format("Regular Price: %.2f", currentPrice));
		
		return currentPrice;
	}

	@Override
	protected boolean isAppliable() {
		return true;
	}
}
