package br.com.cod3r.builder.spolleto.after.builder;

import br.com.cod3r.builder.spolleto.after.model.Salad;
import br.com.cod3r.builder.spolleto.after.model.Size;

public class SaladBuilder extends MealBuilder<Salad> {

	private Salad salad;

	public SaladBuilder(Size size) {
		this.salad = new Salad(size);
	}

	@Override
	public void addToppings() {
		salad.setToppings("Ham", "Broccoli", "Mushrooms");		
	}
	
	@Override
	public void addCheese() {
		salad.setCheese(true);		
	}
	
	@Override
	public void addPepper() {
		salad.setPepper(false);		
	}
	
	@Override
	public void addSauces() {
		salad.setSauces("Rose", "White");		
	}

	@Override
	public Salad getMeal() {
		return this.salad;
	}
}
