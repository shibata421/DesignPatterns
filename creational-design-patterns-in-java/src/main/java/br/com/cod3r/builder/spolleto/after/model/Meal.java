package br.com.cod3r.builder.spolleto.after.model;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public abstract class Meal {
	
	protected Collection<String> toppings;
	protected Collection<String> sauces;
	protected Size size;
	protected boolean cheese;
	protected boolean pepper;
	
	public Meal(Size size) {
		this.size = size;
	}

	public Collection<String> getToppings() {
		return Collections.unmodifiableCollection(toppings);
	}
	
	public void setToppings(String... toppings) {
		this.toppings = new HashSet<>(Arrays.asList(toppings));
	}

	public Collection<String> getSauces() {
		return Collections.unmodifiableCollection(sauces);
	}

	public void setSauces(String... sauces) {
		this.sauces = new HashSet<>(Arrays.asList(sauces));
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public boolean hasCheese() {
		return cheese;
	}

	public void setCheese(boolean cheese) {
		this.cheese = cheese;
	}

	public boolean hasPepper() {
		return pepper;
	}

	public void setPepper(boolean pepper) {
		this.pepper = pepper;
	}

}
