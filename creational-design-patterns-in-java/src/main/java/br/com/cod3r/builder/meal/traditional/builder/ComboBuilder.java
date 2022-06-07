package br.com.cod3r.builder.meal.traditional.builder;

public class ComboBuilder extends FastFoodMealBuilder {

	@Override
	public void buildDrink() {
		meal.setDrink("Coca");
	}
	
	@Override
	public void buildGift() {
		meal.setToy("Pokemon Card");
	}
	
	@Override
	public void buildMain() {
		meal.setMain("Burger");
	}
	
	@Override
	public void buildSide() {
		meal.setSide("Fries");
	}
	
	@Override
	public void buildDessert() {
		meal.setDessert("Sundae");
	}
}
