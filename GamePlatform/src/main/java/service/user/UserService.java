package service.user;

import model.Game;
import model.Subscription;
import model.User;

public interface UserService {
	
	public String createUser(String username, String password, String firstName, String lastName, String email);
	public String getUser(String username);
	public String deleteUser(User u, String username);
	public String updateUser(String username, String password, String firstName, String lastName, String email);
	public String buyGame(Game g, String username);
	public String showBoughtGames(String username);
	public String buySubscription(Subscription s, String username);

}
