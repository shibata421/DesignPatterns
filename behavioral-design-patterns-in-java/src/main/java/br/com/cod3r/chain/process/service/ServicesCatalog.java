package br.com.cod3r.chain.process.service;

import br.com.cod3r.chain.process.steps.ProcessStep;
import br.com.cod3r.chain.process.steps.SaveUser;
import br.com.cod3r.chain.process.steps.ValidateEmail;
import br.com.cod3r.chain.process.steps.ValidateName;
import br.com.cod3r.chain.process.steps.ValidatePassword;

public class ServicesCatalog {

	public static ProcessStep<Boolean> saveUserService() {
		ProcessStep<Boolean> validateEmail = new ValidateEmail();
		ProcessStep<Boolean> validatePassword = new ValidatePassword();
		ProcessStep<Boolean> validateName = new ValidateName();
		ProcessStep<String> save = new SaveUser();
		
		validateEmail.setNextStep(validatePassword);
		validatePassword.setNextStep(validateName);
		validateName.setNextStep(save);
		
		return validateEmail;
	}
}
