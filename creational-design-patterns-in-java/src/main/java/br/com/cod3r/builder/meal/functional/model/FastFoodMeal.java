package br.com.cod3r.builder.meal.functional.model;

public class FastFoodMeal {

	private final String main;
	private final String side;
	private final String drink;
	private final String dessert;
	private final String gift;
	
	private FastFoodMeal(String main, String side, String drink, String dessert, String gift) {
		this.main = main;
		this.side = side;
		this.drink = drink;
		this.dessert = dessert;
		this.gift = gift;
	}
	
	public String getMain() {
		return main;
	}

	public String getSide() {
		return side;
	}

	public String getDrink() {
		return drink;
	}

	public String getDessert() {
		return dessert;
	}

	public String getGift() {
		return gift;
	}

	@Override
	public String toString() {
		return String.format("FastFoodMeal [main = %s, side = %s, drink = %s, dessert = %s, gift = %s]", 
				main, side, drink, dessert, gift);
	}
	
	public static class Builder {

		private String main;
		private String side;
		private String drink;
		private String dessert;
		private String gift;
		
		public Builder(String main) {
			this.main = main;
		}
		
		public Builder withSide(String side) {
			this.side = side;
			return this;
		}
		
		public Builder withDrink(String drink) {
			this.drink = drink;
			return this;
		}
		
		public Builder withDessert(String dessert) {
			this.dessert = dessert;
			return this;
		}
		
		public Builder withGift(String gift) {
			this.gift = gift;
			return this;
		}
		
		public FastFoodMeal thatsAll() {
			return new FastFoodMeal(main, side, drink, dessert, gift);
		}
	}
}
