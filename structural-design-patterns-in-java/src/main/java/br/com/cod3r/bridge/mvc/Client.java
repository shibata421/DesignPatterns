package br.com.cod3r.bridge.mvc;

import br.com.cod3r.bridge.mvc.dao.UserMongoDao;
import br.com.cod3r.bridge.mvc.dao.UserMysqlDao;
import br.com.cod3r.bridge.mvc.model.User;
import br.com.cod3r.bridge.mvc.services.UserEJB;
import br.com.cod3r.bridge.mvc.services.UserRest;
import br.com.cod3r.bridge.mvc.services.UserService;

public class Client {

	public static void main(String[] args) {
		User user = new User("user", "user@email.com", "passwd");
		
		UserService service = new UserEJB(new UserMongoDao());
		service.save(user);
		
		service = new UserRest(new UserMysqlDao());
		service.save(user);
		
	}
}

