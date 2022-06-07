package br.com.cod3r.builder.meal.fluent;

import br.com.cod3r.builder.meal.fluent.builder.FastFoodMeal;
import br.com.cod3r.builder.meal.fluent.builder.FastFoodMealBuilder;

public class Client {
	
	public static void main(String[] args) {
		FastFoodMeal meal = new FastFoodMealBuilder()
				.withMain("Burger")
				.withDessert("Cake")
				.withSide("Onion rings")
				.thatsAll();
		System.out.println(meal);
		System.out.println("---------------------");
	
		FastFoodMeal meal2 = new FastFoodMealBuilder()
				.withMain("X-Burger")
				.withDessert("Ice cream")
				.withSide("Polenta")
				.withDrink("Water")
				.thatsAll();
		System.out.println(meal2);
		System.out.println("---------------------");
	}
}