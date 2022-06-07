package br.com.cod3r.bridge.mvc.services;

import br.com.cod3r.bridge.mvc.dao.UserDAO;
import br.com.cod3r.bridge.mvc.model.User;

public abstract class UserService {
	
	protected UserDAO dao;

	public UserService(UserDAO dao) {
		this.dao = dao;
	}
	
	public void save(User user) {
		dao.save(user);
	};
}
