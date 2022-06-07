package br.com.cod3r.builder.meal.traditional.builder;

import br.com.cod3r.builder.meal.traditional.model.FastFoodMeal;

public abstract class FastFoodMealBuilder {
	
	protected FastFoodMeal meal;
	
	public FastFoodMealBuilder() {
		meal = new FastFoodMeal();
	}
	
	public FastFoodMeal getMeal() {
		return this.meal;
	}
	
	public void buildDrink() {};
	public void buildMain() {};
	public void buildSide() {};
	public void buildGift() {};
	public void buildDessert() {};
}
