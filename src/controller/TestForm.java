package controller;

import com.opensymphony.xwork2.ActionSupport;

public class TestForm extends ActionSupport{
	
	private String aboutMe;
	
	public String execute() throws Exception{
		return SUCCESS;
	}

	public String getAboutMe() {
		return aboutMe;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}

	
	
}
