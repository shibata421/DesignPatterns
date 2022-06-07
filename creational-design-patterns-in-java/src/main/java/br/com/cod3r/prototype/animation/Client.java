package br.com.cod3r.prototype.animation;

import java.util.ArrayList;
import java.util.List;

import br.com.cod3r.prototype.animation.model.Person;
import br.com.cod3r.prototype.animation.model.PersonSamples;
import br.com.cod3r.prototype.animation.model.PersonType;

public class Client {
	private static List<Person> frames = new ArrayList<Person>();
	
	public static void animate() throws InterruptedException {
		System.out.println("*********************************");
		System.out.println("* ");
		System.out.println("* Adjust your screen's height!");
		System.out.println("* ");
		System.out.print("*********************************");
		
		Thread.sleep(3000);
		for(Person frame: frames) {
			frame.draw();
			Thread.sleep(500);
		}
		
		System.out.println("**********************");
		System.out.println("* ");
		System.out.println("* The End!");
		System.out.println("* ");
		System.out.print("**********************");
	}
	
	public static Person moveLeft(Person person) throws CloneNotSupportedException {
		Person personClone = person.clone();
		personClone.left();
		frames.add(personClone);
		
		return personClone;
	}

	public static Person moveRight(Person person) throws CloneNotSupportedException {
		Person personClone = person.clone();
		personClone.right();
		frames.add(personClone);
		
		return personClone;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
		Person person = new PersonSamples().get(PersonType.FATMAN);
		
		frames.add(person);
		
		for (int i = 0; i < 4; i++) {
			person = moveLeft(person);			
		}
		
		for (int i = 0; i < 8; i++) {
			person = moveRight(person);			
		}
		
		for (int i = 0; i < 4; i++) {
			person = moveLeft(person);			
		}
		
		animate();
	}
}
