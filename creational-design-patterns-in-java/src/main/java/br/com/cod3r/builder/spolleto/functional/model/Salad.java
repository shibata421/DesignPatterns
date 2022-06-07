package br.com.cod3r.builder.spolleto.functional.model;

import java.util.Collection;

import br.com.cod3r.builder.spolleto.functional.builders.MealBuilder;

public class Salad extends Meal{

	private Salad(Collection<String> toppings, Collection<String> sauces, Size size, boolean cheese, boolean pepper) {
		super(toppings, sauces, size, cheese, pepper);
	}

	@Override
	public String toString() {
		return String.format("Salad [toppings = %s, sauces = %s, size = %s, cheese = %s, pepper = %s]", toppings,
				sauces, size, cheese, pepper);
	}

	public static class Builder extends MealBuilder<Salad>{
		public Builder(Size size) {
			super(size);
		}
		
		@Override
		public Salad build() {
			return new Salad(toppings, sauces, size, hasCheese, hasPepper);
		}
	}
}
