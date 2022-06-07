package br.com.cod3r.chain.process.steps;

public abstract class ValidateMandatoryField extends ProcessStep<Boolean> {

	protected void validate (String field, String fieldName) throws Exception {
		if(field == null) {
			throw new Exception(fieldName + " is empty");
		}
	}
	
}
