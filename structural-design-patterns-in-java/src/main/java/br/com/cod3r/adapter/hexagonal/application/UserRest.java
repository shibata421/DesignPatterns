package br.com.cod3r.adapter.hexagonal.application;

import java.util.Map;

import br.com.cod3r.adapter.hexagonal.core.model.User;
import br.com.cod3r.adapter.hexagonal.core.ports.UserRepository;
import br.com.cod3r.adapter.hexagonal.core.usecases.UserService;
import br.com.cod3r.adapter.hexagonal.infrastructure.UserMemoryDatabaseAdapter;

public class UserRest {

	private UserService service;

	public UserRest() {
		UserRepository repository = new UserMemoryDatabaseAdapter();
		this.service = new UserService(repository);
	}

	public Integer post(Map<String, String> values) {
		String name = values.get("name");
		String email = values.get("email");
		String password = values.get("password");

		User user = new User(name, email, password);
		
		try {
			service.saveUser(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 400;
		}
		
		return 201;
	}
	
	public Integer get() {
		service.loadUsers().forEach(System.out::println);
		return 200;
	}
}
