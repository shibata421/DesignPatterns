package br.com.cod3r.prototype.animation.model;

import java.util.HashMap;
import java.util.Map;

public class PersonSamples {
	private Map<PersonType, Person> samples;
	
	public PersonSamples() {
		samples = new HashMap<>();
		loadSamples();
	}
	
	public Person get(PersonType type) {
		return samples.get(type);
	}
	
	private void loadSamples() {
		samples.put(PersonType.STICKMAN, new Person(
				"                   ",
				"        o          ",
				"       /|\\          ",
				"_______/_\\___________"	
				));
		samples.put(PersonType.FATMAN, new Person(
				"                   ",
				"       (^ ^)          ",
				"       <)  )\\         ",
				"_______/__\\___________"	
				));
	}
}
