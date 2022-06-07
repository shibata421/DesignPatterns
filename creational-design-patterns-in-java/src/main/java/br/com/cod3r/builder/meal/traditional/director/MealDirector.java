package br.com.cod3r.builder.meal.traditional.director;

import br.com.cod3r.builder.meal.traditional.builder.FastFoodMealBuilder;
import br.com.cod3r.builder.meal.traditional.model.FastFoodMeal;

public class MealDirector {

	private FastFoodMealBuilder builder;

	public MealDirector(FastFoodMealBuilder builder) {
		this.builder = builder;
	}
	
	public void constructMeal() {
		builder.buildDrink();
		builder.buildDessert();
		builder.buildGift();
		builder.buildMain();
		builder.buildSide();
	}
	
	public FastFoodMeal getMeal() {
		return builder.getMeal();
	}
}
