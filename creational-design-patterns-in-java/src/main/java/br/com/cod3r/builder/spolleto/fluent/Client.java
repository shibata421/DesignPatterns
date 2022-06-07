package br.com.cod3r.builder.spolleto.fluent;

import br.com.cod3r.builder.spolleto.fluent.builders.PastaBuilder;
import br.com.cod3r.builder.spolleto.fluent.builders.SaladBuilder;
import br.com.cod3r.builder.spolleto.fluent.model.Pasta;
import br.com.cod3r.builder.spolleto.fluent.model.Salad;
import br.com.cod3r.builder.spolleto.fluent.model.Size;

public class Client {
	
	public static void main(String[] args) {
		Pasta pasta = new PastaBuilder(Size.LARGE)
				.addCheese(true)
				.build();
		
		Salad salad = new SaladBuilder(Size.STANDARD).build();
		System.out.println(pasta);
		System.out.println(salad);
		
	}

}
