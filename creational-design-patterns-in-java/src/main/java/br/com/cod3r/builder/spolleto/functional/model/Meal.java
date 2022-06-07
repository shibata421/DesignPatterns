package br.com.cod3r.builder.spolleto.functional.model;

import java.util.Collection;

public abstract class Meal {

	protected final Collection<String> toppings;
	protected final Collection<String> sauces;
	protected final Size size;
	protected final boolean cheese;
	protected final boolean pepper;

	public Meal(Collection<String> toppings, Collection<String> sauces, Size size, boolean cheese, boolean pepper) {
		this.toppings = toppings;
		this.sauces = sauces;
		this.size = size;
		this.cheese = cheese;
		this.pepper = pepper;
	}
}
