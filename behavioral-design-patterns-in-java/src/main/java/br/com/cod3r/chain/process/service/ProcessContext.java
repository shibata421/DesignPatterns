package br.com.cod3r.chain.process.service;

import br.com.cod3r.chain.process.entities.User;

public class ProcessContext {

	private Object processResult;
	private User user;

	public ProcessContext() {
		this(new User());
	}
	
	public ProcessContext(User user) {
		this.user = user;
	}
	
	public void setUserName(String name) {
		user.setName(name);
	}

	public void reset() {
		processResult = null;
	}

	public void addProcessResult(Object result) {
		this.processResult = result;
	}

	public Object getProcessResult() {
		return processResult;
	}

	public void setUserEmail(String email) {
		user.setEmail(email);
	}
	
	public void setUserPassword(String password) {
		user.setPassword(password);
	}

	public String getUserEmail() {
		return user.getEmail();
	}
	
	public String getUserName() {
		return user.getName();
	}
	
	public String getUserPassword() {
		return user.getPassword();
	}

	public User getUser() {
		return this.user;
	}
}
