package br.com.cod3r.builder.spolleto.after.model;

public final class Pasta extends Meal {

	public Pasta(Size size) {
		super(size);
	}

	@Override
	public String toString() {
		return String.format("Pasta [toppings = %s, sauces = %s, size = %s, cheese = %s, pepper = %s]", toppings,
				sauces, size, cheese, pepper);
	}
}
