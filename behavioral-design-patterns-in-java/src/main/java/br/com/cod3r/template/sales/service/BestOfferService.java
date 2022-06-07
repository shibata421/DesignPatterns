package br.com.cod3r.template.sales.service;

import java.util.Arrays;
import java.util.List;

import br.com.cod3r.template.sales.model.Cart;
import br.com.cod3r.template.sales.template.BlackFridayTemplate;
import br.com.cod3r.template.sales.template.CategoryDiscountTemplate;
import br.com.cod3r.template.sales.template.FreeDeliveryTemplate;
import br.com.cod3r.template.sales.template.Over1000Template;
import br.com.cod3r.template.sales.template.PriceTemplate;
import br.com.cod3r.template.sales.template.RegularPriceTemplate;
import br.com.cod3r.template.sales.template.SpecialClientTemplate;

public class BestOfferService {

	private List<PriceTemplate> templates;

	public void calculateBestOffer(Cart cart) {
		createOfferTemplateList(cart);
		
		Double bestPrice = Double.MAX_VALUE;
		for (PriceTemplate priceTemplate : templates) {
			bestPrice = priceTemplate.calculateOffer(bestPrice);				
		}

		System.out.println(String.format("Final Price: %.2f", bestPrice));
	}

	private void createOfferTemplateList(Cart cart) {
		templates = Arrays.asList(
				new RegularPriceTemplate(cart),
				new FreeDeliveryTemplate(cart),
				new SpecialClientTemplate(cart),
				new Over1000Template(cart),
				new CategoryDiscountTemplate(cart),
				new BlackFridayTemplate(cart));
	}
}