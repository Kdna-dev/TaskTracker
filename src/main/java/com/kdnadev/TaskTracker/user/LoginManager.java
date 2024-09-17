package com.kdnadev.TaskTracker.user;

public class LoginManager {
	private static LoginManager instance;
	private String user;
	private String password;
	public int userPasswordHashCode;

	private LoginManager (String user, String password) {
		this.user = user;
		this.password = password;
		userPasswordHashCode = hashCode();
	}

	public static LoginManager startSession(String user, String password){
		if(instance == null){
			instance = new LoginManager(user, password);
		}
		return instance;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 31 * hash + (user == null ? 0 : user.hashCode());
		hash = 31 * hash + (password == null ? 0 : password.hashCode());
		return hash;
	}
}
