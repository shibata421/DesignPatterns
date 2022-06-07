package br.com.cod3r.strategy.calc;

import br.com.cod3r.strategy.calc.strategies.AddStrategy;
import br.com.cod3r.strategy.calc.strategies.DivisionStrategy;
import br.com.cod3r.strategy.calc.strategies.MultiplicationStrategy;
import br.com.cod3r.strategy.calc.strategies.SubtractionStrategy;

public class Client {

	public static void main(String[] args) {
		Calculator calc = new Calculator(10, 2);
		System.out.println(calc.getResult(new AddStrategy()));
		System.out.println(calc.getResult(new SubtractionStrategy()));
		System.out.println(calc.getResult(new MultiplicationStrategy()));
		System.out.println(calc.getResult(new DivisionStrategy()));
	}
}
