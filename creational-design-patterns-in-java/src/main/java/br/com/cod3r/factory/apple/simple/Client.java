package br.com.cod3r.factory.apple.simple;

import br.com.cod3r.factory.apple.simple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.simple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone1 = IPhoneFactory.createIphone("X", "standard");
		System.out.println(iphone1);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = IPhoneFactory.createIphone("11", "highend");
		System.out.println(iphone2);
	}
}
