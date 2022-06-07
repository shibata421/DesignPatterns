package br.com.cod3r.strategy.worker.jobs;

import br.com.cod3r.strategy.worker.strategies.eat.VeggieStrategy;
import br.com.cod3r.strategy.worker.strategies.transportation.BikeStrategy;
import br.com.cod3r.strategy.worker.strategies.work.CodeStrategy;

public class HealthyDeveloper implements Worker {

	@Override
	public void eat() {
		new VeggieStrategy().eat();
	}

	@Override
	public void move() {
		new BikeStrategy().move();
	}

	@Override
	public void work() {
		new CodeStrategy().work();
	}

}
