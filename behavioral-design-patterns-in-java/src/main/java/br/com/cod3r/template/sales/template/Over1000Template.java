package br.com.cod3r.template.sales.template;

import br.com.cod3r.template.sales.model.Cart;

public class Over1000Template extends PriceTemplate {

	public Over1000Template(Cart cart) {
		super(cart);
	}

	@Override
	protected Double calculateOffer() {
		Double over1000Price = (regularItemsPrice * 0.90) + deliveryTax;
		System.out.println(String.format("Over 1000 Price: %.2f", over1000Price));
		
		return over1000Price;
	}

	@Override
	protected boolean isAppliable() {
		return super.regularItemsPrice > 1000;
	}
}
