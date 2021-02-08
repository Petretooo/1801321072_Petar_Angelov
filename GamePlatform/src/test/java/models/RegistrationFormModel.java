package models;

import service.user.UserService;
import service.user.UserServiceImpl;

public class RegistrationFormModel {
	
	UserService userService = new UserServiceImpl();
	
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String message;
	
	public void showRegistrationForm() {
		System.out.println("This is the registration form");
	}
	
	
	public void addUsername(String username) {
		this.username = username;
	}
	public void addPassword(String password) {
		this.password = password;
	}
	public void addFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void addLastName(String lastName) {
		this.lastName = lastName;
	}
	public void addEmail(String email) {
		this.email = email;
	}
	public void addMessage(String message) {
		this.message = message;
	}
	
	public void clickRegistrationButton() {
		message = userService.createUser(username, password, firstName, lastName, email);
	}
	
	public String getMessage() {
		return message;
	}
	

}
