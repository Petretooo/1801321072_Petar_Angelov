package models;

import service.user.UserService;
import service.user.UserServiceImpl;

public class UpdateFormModel {

	UserService userService = new UserServiceImpl();

	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String message;

	public void showUpdateForm() {
		System.out.println("This is the update form");
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

	public void clickSaveButton() {
		message = userService.updateUser(username, password, firstName, lastName, email);
	}

	public String getMessage() {
		return message;
	}

}
