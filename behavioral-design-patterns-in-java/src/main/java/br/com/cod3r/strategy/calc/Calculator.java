package br.com.cod3r.strategy.calc;

import br.com.cod3r.strategy.calc.strategies.CalcStrategy;

public class Calculator {
	private double num1;
	private double num2;
	
	public Calculator(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
//	public int getResult(String operation) {
//		switch (operation) {
//		case "+": return num1 + num2;
//		case "-": return num1 - num2;
//		case "*": return num1 * num2;
//		case "/": return num1 / num2;
//		default: return 0;
//		}
//	}
	
	public Double getResult(CalcStrategy strategy) {
		return strategy.calculate(num1, num2);
	}
}
