package br.com.cod3r.strategy.worker.strategies.eat;

public class AirplaneStrategy implements EatStrategy {

	@Override
	public void eat() {
		System.err.println("Airplane food...............");
	}

}
