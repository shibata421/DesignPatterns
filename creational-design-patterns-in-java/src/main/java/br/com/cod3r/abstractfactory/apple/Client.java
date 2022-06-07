package br.com.cod3r.abstractfactory.apple;

import br.com.cod3r.abstractfactory.apple.factory.IPhone11Factory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneFactory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.BrazilianRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.USRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;

public class Client {

	public static void main(String[] args) {
		// Brazil
		CountryRulesAbstractFactory brRules = new BrazilianRulesAbstractFactory();
		IPhoneFactory iPhone11Factory = new IPhone11Factory(brRules);
		IPhone iPhone = iPhone11Factory.orderIPhone("standard");
		System.out.println(iPhone);

		System.out.println();

		// US
		CountryRulesAbstractFactory usRules = new USRulesAbstractFactory();
		IPhoneFactory iPhoneXFactory = new IPhoneXFactory(usRules);
		IPhone iPhoneUS = iPhoneXFactory.orderIPhone("highEnd");
		System.out.println(iPhoneUS);
	}
}
