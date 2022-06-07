package br.com.cod3r.builder.spolleto.fluent.builders;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

import br.com.cod3r.builder.spolleto.fluent.model.Meal;
import br.com.cod3r.builder.spolleto.fluent.model.Size;

public abstract class MealBuilder<T extends Meal> {

	protected Collection<String> toppings;
	protected Collection<String> sauces;
	protected Size size;
	protected boolean hasCheese;
	protected boolean hasPepper;

	public MealBuilder(Size size) {
		this.size = size;
	}

	public MealBuilder<T> addTopings(String... toppings) {
		this.toppings = new HashSet<>(Arrays.asList(toppings));
		return this;
	}

	public MealBuilder<T> addSauces(String... sauces) {
		this.sauces = new HashSet<>(Arrays.asList(sauces));
		return this;
	}

	public MealBuilder<T> addCheese(boolean hasCheese) {
		this.hasCheese = hasCheese;
		return this;
	}

	public MealBuilder<T> addPepper(boolean hasPepper) {
		this.hasPepper = hasPepper;
		return this;
	}

	public abstract T build();
}
