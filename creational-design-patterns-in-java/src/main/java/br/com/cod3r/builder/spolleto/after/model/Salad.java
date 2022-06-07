package br.com.cod3r.builder.spolleto.after.model;

public final class Salad extends Meal {

	public Salad(Size size) {
		super(size);
	}

	@Override
	public String toString() {
		return String.format("Salad [toppings = %s, sauces = %s, size = %s, cheese = %s, pepper = %s]", toppings,
				sauces, size, cheese, pepper);
	}
}
