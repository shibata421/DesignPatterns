package br.com.cod3r.chain.process.steps;

import br.com.cod3r.chain.process.service.ProcessContext;

public class ValidateEmail extends ValidateMandatoryField {

	@Override
	public ProcessContext execute(ProcessContext context) throws Exception {
		String email = context.getUserEmail();
		
		super.validate(email, "email");
		
		return next(context, true);
	}

}
