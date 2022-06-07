package br.com.cod3r.builder.spolleto.after.builder;

import br.com.cod3r.builder.spolleto.after.model.Meal;

public abstract class MealBuilder<T extends Meal> {

	public abstract T getMeal();
	
	public void addToppings() {	
	}
	
	public void addCheese() {	
	}
	
	public void addPepper() {		
	}
	
	public void addSauces() {		
	}
}
