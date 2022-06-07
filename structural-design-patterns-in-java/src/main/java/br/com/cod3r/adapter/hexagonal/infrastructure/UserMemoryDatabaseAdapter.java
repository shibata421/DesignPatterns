package br.com.cod3r.adapter.hexagonal.infrastructure;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import br.com.cod3r.adapter.hexagonal.core.model.User;
import br.com.cod3r.adapter.hexagonal.core.ports.UserRepository;

public class UserMemoryDatabaseAdapter implements UserRepository {

	private Set<User> users = new HashSet<>();
	
	@Override
	public void save(User user) {
		users.add(user);
	}

	@Override
	public Collection<User> getAll() {
		return users;
	}

}
