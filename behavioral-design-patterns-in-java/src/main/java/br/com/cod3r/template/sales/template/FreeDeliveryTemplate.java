package br.com.cod3r.template.sales.template;

import br.com.cod3r.template.sales.model.Cart;

public class FreeDeliveryTemplate extends PriceTemplate {

	public FreeDeliveryTemplate(Cart cart) {
		super(cart);
	}

	@Override
	protected Double calculateOffer() {
		System.out.println(String.format("Delivery Tax Discount: %.2f", super.regularItemsPrice));
		return super.regularItemsPrice;
	}

	@Override
	protected boolean isAppliable() {
		return super.regularItemsPrice > 500;
	}
}
