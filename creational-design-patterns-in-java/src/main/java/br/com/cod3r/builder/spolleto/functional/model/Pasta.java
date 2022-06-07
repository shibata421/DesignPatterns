package br.com.cod3r.builder.spolleto.functional.model;

import java.util.Collection;

import br.com.cod3r.builder.spolleto.functional.builders.MealBuilder;

public class Pasta extends Meal {

	private Pasta(Collection<String> toppings, Collection<String> sauces, Size size, boolean cheese, boolean pepper) {
		super(toppings, sauces, size, cheese, pepper);
	}

	@Override
	public String toString() {
		return "Pasta [toppings=" + toppings + ", sauces=" + sauces + ", size=" + size + ", cheese=" + cheese
				+ ", pepper=" + pepper + "]";
	}

	public static class Builder extends MealBuilder<Pasta> {

		public Builder(Size size) {
			super(size);
		}

		@Override
		public Pasta build() {
			return new Pasta(toppings, sauces, size, hasCheese, hasPepper);
		}

	}
}
