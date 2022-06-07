package br.com.cod3r.builder.spolleto.fluent.model;

import java.util.Collection;

public abstract class Meal {

	protected Collection<String> toppings;
	protected Collection<String> sauces;
	protected Size size;
	protected boolean cheese;
	protected boolean pepper;

	public Meal(Collection<String> toppings, Collection<String> sauces, Size size, boolean cheese, boolean pepper) {
		this.toppings = toppings;
		this.sauces = sauces;
		this.size = size;
		this.cheese = cheese;
		this.pepper = pepper;
	}
}
