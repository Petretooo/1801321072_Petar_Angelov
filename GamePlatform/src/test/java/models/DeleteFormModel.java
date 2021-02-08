package models;

import service.user.UserService;
import service.user.UserServiceImpl;

public class DeleteFormModel {
	
	private UserService userService = new UserServiceImpl();
	
	private String username;
	private String message;

	public void showDeleteForm() {
		System.out.println("This is delete form");
		
	}

	public void addUsername(String arg1) {
		this.username = arg1;
		
	}

	public void clickButton() {
		this.message = userService.deleteUser(null, username);
		
	}

	public String showMessage() {
		return message;		
	}

}
