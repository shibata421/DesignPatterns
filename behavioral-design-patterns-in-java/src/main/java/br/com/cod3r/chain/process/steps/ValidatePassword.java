package br.com.cod3r.chain.process.steps;

import br.com.cod3r.chain.process.service.ProcessContext;

public class ValidatePassword extends ValidateMandatoryField {

	@Override
	public ProcessContext execute(ProcessContext context) throws Exception {
		String password = context.getUserPassword();
		
		super.validate(password, "password");
		
		return next(context, true);
	}

}
