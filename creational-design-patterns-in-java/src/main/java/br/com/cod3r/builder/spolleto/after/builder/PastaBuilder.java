package br.com.cod3r.builder.spolleto.after.builder;

import br.com.cod3r.builder.spolleto.after.model.Pasta;
import br.com.cod3r.builder.spolleto.after.model.Size;

public class PastaBuilder extends MealBuilder<Pasta> {

	private Pasta pasta;

	public PastaBuilder(Size size) {
		this.pasta = new Pasta(size);
	}
	
	@Override
	public void addCheese() {
		pasta.setCheese(true);
	}
	
	@Override
	public void addPepper() {
		pasta.setPepper(false);
	}
	
	@Override
	public void addSauces() {
		pasta.setSauces("Rose", "White");
	}
	
	@Override
	public void addToppings() {
		pasta.setToppings("Ham", "Broccoli", "Mushrooms");
	}

	@Override
	public Pasta getMeal() {
		return this.pasta;
	}
}
