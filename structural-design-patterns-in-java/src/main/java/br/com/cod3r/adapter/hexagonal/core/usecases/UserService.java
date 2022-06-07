package br.com.cod3r.adapter.hexagonal.core.usecases;

import java.util.Collection;

import br.com.cod3r.adapter.hexagonal.core.model.User;
import br.com.cod3r.adapter.hexagonal.core.ports.UserRepository;

public class UserService {
	
	private UserRepository repository;

	public UserService(UserRepository repository) {
		this.repository = repository;
	}
	
	public void saveUser(User user) {
		String email = user.getEmail();
		
		boolean emailAlreadyExists = repository.getAll().stream()
				.map(u -> u.getEmail())
				.anyMatch(e -> e.equalsIgnoreCase(email));
		
		if(emailAlreadyExists) {
			throw new RuntimeException("email already exists");
		}
		
		repository.save(user);
		System.out.println("User saved with success");
	}
	
	public Collection<User> loadUsers() {
		return repository.getAll();
	}
}
