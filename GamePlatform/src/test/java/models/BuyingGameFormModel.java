package models;

import service.user.UserService;
import service.user.UserServiceImpl;

public class BuyingGameFormModel {
	UserService userService = new UserServiceImpl();
	
	private String message;
	
	public void showForm() {
		System.out.println("This is game buying form");
	}
	
	public void buyGame(String username) {
		message = userService.buyGame(null, username);
	}
	
	public String getMessage() {
		return message;
	}

}
