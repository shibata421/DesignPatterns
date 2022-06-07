package br.com.cod3r.strategy.worker.jobs;

import br.com.cod3r.strategy.worker.strategies.eat.AirplaneStrategy;
import br.com.cod3r.strategy.worker.strategies.transportation.PlaneStrategy;
import br.com.cod3r.strategy.worker.strategies.work.PilotingStrategy;

public class Pilot implements Worker {

	@Override
	public void eat() {
		new AirplaneStrategy().eat();
	}

	@Override
	public void move() {
		new PlaneStrategy().move();
	}

	@Override
	public void work() {
		new PilotingStrategy().work();
	}

}
