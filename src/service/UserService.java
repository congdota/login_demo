package service;

import java.util.List;

import entity.User;

public interface UserService {
	
	User getUser(String username, String password);
	
	List<User> getUsers();
	
}
