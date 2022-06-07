package br.com.cod3r.template.sales.template;

import br.com.cod3r.template.sales.model.Cart;

public class BlackFridayTemplate extends PriceTemplate {

	public BlackFridayTemplate(Cart cart) {
		super(cart);
	}

	@Override
	protected Double calculateOffer() {
		Double blackFridayPrice = (regularItemsPrice * 0.75) + deliveryTax;
		System.out.println(String.format("Black Friday Price: %.2f", blackFridayPrice));
		return blackFridayPrice;
	}

	@Override
	protected boolean isAppliable() {
		return true; // should implement better
	}
}
