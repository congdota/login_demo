package controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import entity.User;

public class WelcomeAction extends ActionSupport implements ModelDriven<User>{
	
	private User user = new User();
	
	@Override
	public String execute(){
		return SUCCESS;
	}
	
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
}
