package br.com.cod3r.chain.process.steps;

import br.com.cod3r.chain.process.entities.User;
import br.com.cod3r.chain.process.repository.UserRepository;
import br.com.cod3r.chain.process.service.ProcessContext;

public class SaveUser extends ProcessStep<String> {

	@Override
	public ProcessContext execute(ProcessContext context) throws Exception {
		User userInput = context.getUser();
		UserRepository.getInstance().saveUser(userInput);
		return next(context, String.format("User '%s' saved!", userInput.getName()));
	}

}
