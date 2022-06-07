package br.com.cod3r.builder.meal.traditional;

import br.com.cod3r.builder.meal.traditional.builder.ComboBuilder;
import br.com.cod3r.builder.meal.traditional.director.MealDirector;

public class Client {
	
	public static void main(String[] args) {
		MealDirector director = new MealDirector(new ComboBuilder());
		director.constructMeal();
		System.out.println(director.getMeal());
	}
}