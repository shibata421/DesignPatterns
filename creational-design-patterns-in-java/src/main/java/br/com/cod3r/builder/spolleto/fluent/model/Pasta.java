package br.com.cod3r.builder.spolleto.fluent.model;

import java.util.Collection;

public class Pasta extends Meal{

	public Pasta(Collection<String> toppings, Collection<String> sauces, Size size, boolean cheese, boolean pepper) {
		super(toppings, sauces, size, cheese, pepper);
	}

	@Override
	public String toString() {
		return "Pasta [toppings=" + toppings + ", sauces=" + sauces + ", size=" + size + ", cheese=" + cheese
				+ ", pepper=" + pepper + "]";
	}
}
