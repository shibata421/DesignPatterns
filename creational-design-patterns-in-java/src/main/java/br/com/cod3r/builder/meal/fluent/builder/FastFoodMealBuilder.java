package br.com.cod3r.builder.meal.fluent.builder;

public class FastFoodMealBuilder {
	
	private String main;
	private String side;
	private String drink;
	private String dessert;
	private String toy;

	public FastFoodMealBuilder withMain(String main) {
		this.main = main;
		return this;
	}
	
	public FastFoodMealBuilder withSide(String side) {
		this.side = side;
		return this;
	}
	
	public FastFoodMealBuilder withDrink(String drink) {
		this.drink = drink;
		return this;
	}
	
	public FastFoodMealBuilder withDessert(String dessert) {
		this.dessert = dessert;
		return this;
	}
	
	public FastFoodMealBuilder withToy(String toy) {
		this.toy = toy;
		return this;
	}
	
	public FastFoodMeal thatsAll() {
		return new FastFoodMeal(drink, main, side, dessert, toy);
	}

}
