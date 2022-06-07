package br.com.cod3r.builder.spolleto.fluent.model;

import java.util.Collection;

public class Salad extends Meal{

	public Salad(Collection<String> toppings, Collection<String> sauces, Size size, boolean cheese, boolean pepper) {
		super(toppings, sauces, size, cheese, pepper);
	}

	@Override
	public String toString() {
		return String.format("Salad [toppings = %s, sauces = %s, size = %s, cheese = %s, pepper = %s]", toppings,
				sauces, size, cheese, pepper);
	}
}
