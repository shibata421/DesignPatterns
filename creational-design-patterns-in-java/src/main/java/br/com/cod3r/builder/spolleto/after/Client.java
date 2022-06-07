package br.com.cod3r.builder.spolleto.after;

import br.com.cod3r.builder.spolleto.after.builder.PastaBuilder;
import br.com.cod3r.builder.spolleto.after.builder.SaladBuilder;
import br.com.cod3r.builder.spolleto.after.director.MealDirector;
import br.com.cod3r.builder.spolleto.after.model.Meal;
import br.com.cod3r.builder.spolleto.after.model.Size;

public class Client {

	public static void main(String[] args) {
		MealDirector director = new MealDirector(new PastaBuilder(Size.LARGE));
		director.cook();
		Meal pasta = director.getOrder();
		System.out.println(pasta);
		
		MealDirector saladDirector = new MealDirector(new SaladBuilder(Size.SMALL));
		saladDirector.cook();
		System.out.println(saladDirector.getOrder());
	}
	
}
