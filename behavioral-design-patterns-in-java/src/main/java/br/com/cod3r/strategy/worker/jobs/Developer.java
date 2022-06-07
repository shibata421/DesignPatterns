package br.com.cod3r.strategy.worker.jobs;

import br.com.cod3r.strategy.worker.strategies.eat.MeatStrategy;
import br.com.cod3r.strategy.worker.strategies.transportation.CarStrategy;
import br.com.cod3r.strategy.worker.strategies.work.CodeStrategy;

public class Developer implements Worker {

	@Override
	public void eat() {
		new MeatStrategy().eat();
	}

	@Override
	public void move() {
		new CarStrategy().move();
	}

	@Override
	public void work() {
		new CodeStrategy().work();
	}

}
