package models;

import service.user.UserService;
import service.user.UserServiceImpl;

public class BuySubscriptionFormModel {

	UserService userService = new UserServiceImpl();

	private String message;

	public void showFormSubscription() {
		System.out.println("This is subscription form");

	}

	public void buySubscription(String arg1) {
		message = userService.buySubscription(null, arg1);

	}

	public String showMessage() {
		return message;
	}

}
