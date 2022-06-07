package br.com.cod3r.chain.process.repository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import br.com.cod3r.chain.process.entities.User;

public class UserRepository {

	private static Map<String, User> memory;
	private static UserRepository instance = new UserRepository();

	public static UserRepository getInstance() {
		return instance;
	}

	private UserRepository() {
		User user = new User();
		
		user.setName("user #1");
		user.setEmail("user@email.com");
		user.setPassword("123456");
		
		memory = new LinkedHashMap<>();
		memory.put("user@email.com", user);
	}

	public Object getUserByEmail(String email) {
		return memory.get(email);
	}

	public List<User> getUsers() {
		return new ArrayList<>(memory.values());
	}

	public void saveUser(User user) {
		memory.put(user.getEmail(), user);
	}
}
