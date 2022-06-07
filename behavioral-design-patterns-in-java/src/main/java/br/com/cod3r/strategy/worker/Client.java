package br.com.cod3r.strategy.worker;

import br.com.cod3r.strategy.worker.jobs.Developer;
import br.com.cod3r.strategy.worker.jobs.HealthyDeveloper;
import br.com.cod3r.strategy.worker.jobs.Pilot;
import br.com.cod3r.strategy.worker.jobs.Worker;

public class Client {

	public static void presentYourself(Worker worker, String name) {
		System.out.println("Hi, I'm " + name);
		worker.eat();
		worker.move();
		worker.work();
		System.out.println("----------------");
	}
	
	public static void main(String[] args) {
		Worker jhon = new Developer();
		presentYourself(jhon, "Jhon");
		
		Worker ann = new Pilot();
		presentYourself(ann, "Ann");

		Worker carol = new HealthyDeveloper();
		presentYourself(carol, "carol");
		
		
	}
}
