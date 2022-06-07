package br.com.cod3r.strategy.worker.strategies.transportation;

public class PlaneStrategy implements TransportationStrategy {

	@Override
	public void move() {
		System.out.println("Ouais !! J'aime mon avion !!");
	}

}
