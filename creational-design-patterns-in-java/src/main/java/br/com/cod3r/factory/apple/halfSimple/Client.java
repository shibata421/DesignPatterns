package br.com.cod3r.factory.apple.halfSimple;

import br.com.cod3r.factory.apple.halfSimple.factory.IPhone11Factory;
import br.com.cod3r.factory.apple.halfSimple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.halfSimple.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.halfSimple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		IPhoneFactory iphone11Factory = new IPhone11Factory();
		IPhoneFactory iphoneXFactory = new IPhoneXFactory();
		
		System.out.println("### Ordering an iPhone X");
		IPhone iPhoneX = iphoneXFactory.orderIPhone("standard");
		System.out.println(iPhoneX);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iPhone11 = iphone11Factory.orderIPhone("highend");
		System.out.println(iPhone11);
	}
}
