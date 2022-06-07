package br.com.cod3r.builder.spolleto.after.director;

import br.com.cod3r.builder.spolleto.after.builder.MealBuilder;
import br.com.cod3r.builder.spolleto.after.model.Meal;

public class MealDirector {
	
	private MealBuilder<?> builder;

	public MealDirector(MealBuilder<? extends Meal> builder) {
		this.builder = builder;
	}
	
	public void cook() {
		builder.addCheese();
		builder.addPepper();
		builder.addSauces();
		builder.addToppings();
	}
	
	public Meal getOrder() {
		return builder.getMeal();
	}

}
