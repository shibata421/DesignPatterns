package br.com.cod3r.strategy.worker.strategies.eat;

public class VeggieStrategy implements EatStrategy {

	@Override
	public void eat() {
		System.out.println("I love my veggies!!!");
	}

}
