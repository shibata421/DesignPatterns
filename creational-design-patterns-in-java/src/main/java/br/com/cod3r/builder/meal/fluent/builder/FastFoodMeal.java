package br.com.cod3r.builder.meal.fluent.builder;

public class FastFoodMeal {

	private String drink;
	private String main;
	private String side;
	private String dessert;
	private String gift;
	
	FastFoodMeal(String drink, String main, String side, String dessert, String gift) {
		this.drink = drink;
		this.main = main;
		this.side = side;
		this.dessert = dessert;
		this.gift = gift;
	}

	@Override
	public String toString() {
		return String.format("Combo [drink=%s, main=%s, side=%s, dessert=%s, gift=%s]", drink, main, side, dessert, gift);
	}
}
