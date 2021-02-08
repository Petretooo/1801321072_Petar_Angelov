package models;

import service.user.UserService;
import service.user.UserServiceImpl;

public class ShowBoughtGamesFormModel {
	
	
	private UserService userService = new UserServiceImpl();
	private String message;
	
	
	public void showBoughtGamesForm() {
		System.out.println("This is the catalog of bought games form");	
	}


	public void showGames(String arg1) {
		message = userService.showBoughtGames(arg1);
	}
	
	public void showGames() {
		System.out.println(message);
	}

}
