package br.com.cod3r.factory.apple.after;

import br.com.cod3r.factory.apple.after.factory.IPhone11Factory;
import br.com.cod3r.factory.apple.after.factory.IPhone11ProFactory;
import br.com.cod3r.factory.apple.after.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.after.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.after.factory.IPhoneXSMaxFactory;
import br.com.cod3r.factory.apple.after.model.IPhone;

public class ClientAfter {
	
	public static void main(String[] args) {
		IPhoneFactory iPhoneXFactory = new IPhoneXFactory();
		IPhoneFactory iPhoneXSMaxFactory = new IPhoneXSMaxFactory();
		IPhoneFactory iPhone11Factory = new IPhone11Factory();
		IPhoneFactory iPhone11ProFactory = new IPhone11ProFactory();
		
		System.out.println("### Ordering an iPhone X");
		IPhone iPhoneX = iPhoneXFactory.orderPhone();
		System.out.println(iPhoneX);
		
		System.out.println("\n\n### Ordering an iPhone XSMax");
		IPhone iPhoneXSMax = iPhoneXSMaxFactory.orderPhone();
		System.out.println(iPhoneXSMax);

		System.out.println("\n\n### Ordering an iPhone 11");
		IPhone iPhone11 = iPhone11Factory.orderPhone();
		System.out.println(iPhone11);

		System.out.println("\n\n### Ordering an iPhone 11 Highend");
		IPhone iPhone11Pro = iPhone11ProFactory.orderPhone();
		System.out.println(iPhone11Pro);
	}
}
