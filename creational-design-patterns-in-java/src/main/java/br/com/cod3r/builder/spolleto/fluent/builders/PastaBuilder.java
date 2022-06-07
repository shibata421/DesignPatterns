package br.com.cod3r.builder.spolleto.fluent.builders;

import br.com.cod3r.builder.spolleto.fluent.model.Pasta;
import br.com.cod3r.builder.spolleto.fluent.model.Size;

public class PastaBuilder extends MealBuilder<Pasta> {

	public PastaBuilder(Size size) {
		super(size);
	}

	@Override
	public Pasta build() {
		return new Pasta(toppings, sauces, size, hasCheese, hasPepper);
	}
}
