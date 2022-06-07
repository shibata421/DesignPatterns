package br.com.cod3r.bridge.mvc.services;

import br.com.cod3r.bridge.mvc.dao.UserDAO;
import br.com.cod3r.bridge.mvc.model.User;

public class UserSoap extends UserService {

	public UserSoap(UserDAO dao) {
		super(dao);
	}

	public void save(User user) {
		super.save(user);
		System.out.println("Starting a save operation through Soap Protocol!");
	}
}
