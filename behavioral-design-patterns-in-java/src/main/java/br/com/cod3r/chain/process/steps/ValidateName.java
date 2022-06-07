package br.com.cod3r.chain.process.steps;

import br.com.cod3r.chain.process.service.ProcessContext;

public class ValidateName extends ValidateMandatoryField {

	@Override
	public ProcessContext execute(ProcessContext context) throws Exception {
		String name = context.getUserName();
		
		super.validate(name, "name");
		
		return next(context, true);
	}

}
