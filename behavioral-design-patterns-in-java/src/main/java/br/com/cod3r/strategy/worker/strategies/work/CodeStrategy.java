package br.com.cod3r.strategy.worker.strategies.work;

public class CodeStrategy implements WorkStrategy {

	@Override
	public void work() {
		System.out.println("System.out.println(\"I love coding!!\")");
	}

}
