package br.com.cod3r.template.sales.template;

import br.com.cod3r.template.sales.model.Cart;

public class SpecialClientTemplate extends PriceTemplate {

	public SpecialClientTemplate(Cart cart) {
		super(cart);
	}

	@Override
	protected Double calculateOffer() {
		Double specialClientPrice = (super.regularItemsPrice * 0.85) + (super.deliveryTax * 0.5);
		System.out.println(String.format("Special Client Price: %.2f", specialClientPrice));
		
		return specialClientPrice;

	}

	@Override
	protected boolean isAppliable() {
		return super.cart.getBuyer().isSpecialClient();
	}
}
