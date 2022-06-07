package br.com.cod3r.builder.spolleto.functional;

import br.com.cod3r.builder.spolleto.functional.model.Pasta;
import br.com.cod3r.builder.spolleto.functional.model.Salad;
import br.com.cod3r.builder.spolleto.functional.model.Size;

public class Client {
	
	public static void main(String[] args) {
		Pasta pasta = new Pasta.Builder(Size.LARGE)
				.addCheese(true)
				.build();
		
		Salad salad = new Salad.Builder(Size.STANDARD).build();
		System.out.println(pasta);
		System.out.println(salad);
		
	}

}
