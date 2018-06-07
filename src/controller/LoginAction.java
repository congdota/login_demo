package controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import entity.User;
import service.UserService;
import service.UserServiceImpl;

public class LoginAction extends ActionSupport implements SessionAware, ServletRequestAware{

	private static final long serialVersionUID = 1L;
	
	private Map<String, Object> session;
	private HttpServletRequest request;
	private List<User> list;
	private UserService service = new UserServiceImpl();
	
	private String username;
	private String password;
	
	
	public HttpServletRequest getRequest() {
		return request;
	}

	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	
	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
		
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = session;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println(" Demo Interceptor ");
		return SUCCESS;
	}
	
	public void validate() {
		if(username == null || username.trim().equals("")) {
			addFieldError("username", "Username Khong dc de trong");
		}
		if(password == null || password.trim().equals("")) {
			addFieldError("password", "Password Khong dc de trong");
		}
	}
	
	public String loginForm() throws Exception {
		List<User> listUser = null;
		listUser = service.getUsers();
		for(User user : listUser) {
			if(user.getUsername().trim().equals(this.username) && user.getPassword().trim().equals(this.password)) {
				this.session.put("username", user.getUsername());
				return SUCCESS;
			}
		}
		request.setAttribute("message", "Username or password is wrong");
		return ERROR;
	}
	
	public String logout() throws Exception {
		if (this.session.containsKey("username")) {
			this.session.remove("username");
		}
		return SUCCESS;
	}
}
