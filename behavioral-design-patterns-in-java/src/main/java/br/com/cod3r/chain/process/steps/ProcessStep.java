package br.com.cod3r.chain.process.steps;

import br.com.cod3r.chain.process.service.ProcessContext;

public abstract class ProcessStep<T> {

	protected ProcessStep<?> nextStep;

	public void setNextStep(ProcessStep<?> next) {
		this.nextStep = next;
	}

	protected ProcessContext next(ProcessContext context, T actualResult) throws Exception {
		context.addProcessResult(actualResult);
		return (this.nextStep != null) ? nextStep.execute(context) : context;
	}

	public abstract ProcessContext execute(ProcessContext context) throws Exception;
}
