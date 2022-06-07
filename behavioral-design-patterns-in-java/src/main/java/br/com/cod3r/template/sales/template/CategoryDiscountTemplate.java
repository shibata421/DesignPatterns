package br.com.cod3r.template.sales.template;

import java.util.HashMap;
import java.util.Map;

import br.com.cod3r.template.sales.model.Cart;
import br.com.cod3r.template.sales.model.Category;
import br.com.cod3r.template.sales.model.Product;

public class CategoryDiscountTemplate extends PriceTemplate {
	
	private Map<Category, Double> discountsByCategory;

	public CategoryDiscountTemplate(Cart cart) {
		super(cart);
		discountsByCategory = new HashMap<>();
		discountsByCategory.put(Category.ELETRONICS, 0.3);
		discountsByCategory.put(Category.CLOTHES, 0.05);
	}

	@Override
	protected Double calculateOffer() {
		Double categoryDiscountsPrice = calculateItemsPriceWithCategoryDiscount(cart) + deliveryTax;
		System.out.println(String.format("Category Discount Price: %.2f", categoryDiscountsPrice));
		return categoryDiscountsPrice;
	}

	@Override
	protected boolean isAppliable() {
		return true;
	}
	
	private Double calculateItemsPriceWithCategoryDiscount(Cart cart) {
		Double totalWithDiscount = 0.0;
		for (Product product : cart) {
			Double value = product.getValue();
			Double discount = discountsByCategory.get(product.getCategory());
			
			if(discount == null) {
				discount = 0.0;
			}
			
			totalWithDiscount += value * (1 - discount);
		}
		
		return totalWithDiscount;
	}
}
