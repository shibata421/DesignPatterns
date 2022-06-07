package br.com.cod3r.builder.meal.functional;

import br.com.cod3r.builder.meal.functional.model.FastFoodMeal;

public class Client {

	public static void main(String[] args) {
		FastFoodMeal meal = new FastFoodMeal.Builder("Burger")
				.withDessert("Ice Cream")
				.thatsAll();
		
		System.out.println(meal);
	}
}
