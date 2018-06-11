package entity;

import java.util.Arrays;

public class User implements java.io.Serializable{
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String username;
	private String password;
	private String email;
	private String aboutMe;
	private String[] rolesSelect;
	private String roleCheckbox;
	private String[] rolesRadio;
	private String doubleSelectRole;
	private String doubleSelectExpertise;
	
	public User() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getAboutMe() {
		return aboutMe;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}

	public String[] getRolesSelect() {
		return rolesSelect;
	}

	public void setRolesSelect(String[] rolesSelect) {
		this.rolesSelect = rolesSelect;
	}

	public String getRoleCheckbox() {
		return roleCheckbox;
	}

	public void setRoleCheckbox(String roleCheckbox) {
		this.roleCheckbox = roleCheckbox;
	}

	public String[] getRolesRadio() {
		return rolesRadio;
	}

	public void setRolesRadio(String[] rolesRadio) {
		this.rolesRadio = rolesRadio;
	}

	public String getDoubleSelectRole() {
		return doubleSelectRole;
	}

	public void setDoubleSelectRole(String doubleSelectRole) {
		this.doubleSelectRole = doubleSelectRole;
	}

	public String getDoubleSelectExpertise() {
		return doubleSelectExpertise;
	}

	public void setDoubleSelectExpertise(String doubleSelectExpertise) {
		this.doubleSelectExpertise = doubleSelectExpertise;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", aboutMe=" + aboutMe + ", rolesSelect=" + Arrays.toString(rolesSelect) + ", roleCheckbox="
				+ roleCheckbox + ", rolesRadio=" + Arrays.toString(rolesRadio) + ", doubleSelectRole="
				+ doubleSelectRole + ", doubleSelectExpertise=" + doubleSelectExpertise + "]";
	}

	
	
	
}
