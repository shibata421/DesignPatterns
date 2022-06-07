package br.com.cod3r.builder.spolleto.fluent.builders;

import br.com.cod3r.builder.spolleto.fluent.model.Salad;
import br.com.cod3r.builder.spolleto.fluent.model.Size;

public class SaladBuilder extends MealBuilder<Salad> {

	public SaladBuilder(Size size) {
		super(size);
	}

	@Override
	public Salad build() {
		return new Salad(toppings, sauces, size, hasCheese, hasPepper);
	}
}
