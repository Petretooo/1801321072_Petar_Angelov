package models;

import service.user.UserService;
import service.user.UserServiceImpl;

public class ProfileFormModel {

	UserService userService = new UserServiceImpl();

	private String username;
	private String message;
	
	public void showProfileForm() {
		System.out.println("This is the profile form");
	}

	public void addUsername(String username) {
		this.username = username;
	}

	public void clickSearchButton() {
		message = userService.getUser(username);
	}

	public String getMessage() {
		return message;
	}
}
