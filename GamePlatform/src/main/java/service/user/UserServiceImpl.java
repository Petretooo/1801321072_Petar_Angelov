package service.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.joda.time.LocalDate;

import model.Game;
import model.Subscription;
import model.User;

public class UserServiceImpl implements UserService {

	private List<User> users;
	private User dummyUser;
	private Game dummyGame;
	public UserServiceImpl() {
		users = new ArrayList<>();
		dummyUser = new User("Peter1", "123456", "Peter", "Angelov", "p.1999@gmail.com");
		users.add(dummyUser);
		
		dummyGame = new Game("Halo 5", "FPS", new LocalDate(2015, 10, 27));
	}

	@Override
	public String createUser(String username, String password, String firstName, String lastName, String email) {
		if (username == null || username.isBlank()) {
			return "Username is invalid";
		} else if (password == null || password.isBlank()) {
			return "Password is invalid";
		} else if (firstName == null || firstName.isBlank()) {
			return "First name is invalid";
		} else if (lastName == null || lastName.isBlank()) {
			return "Last name is invalid";
		} else if (email == null || email.isBlank()) {
			return "Email is invalid";
		}
		User u = new User(username, password, firstName, lastName, email);
		users.add(u);
		return "Successfully Registered";
	}

	@Override
	public String getUser(String username) {
		if (username == null || username.isBlank()) {
			return "Username is invalid";
		}

		User u = users.stream().filter(e -> e.getUsername().equals(username)).findFirst().orElse(null);

		if (u == null) {
			return "There's no user with that username";

		}
		StringBuilder sb = new StringBuilder();
		sb.append(u.getUsername());
		sb.append(System.lineSeparator());
		sb.append(u.getFirstName());
		sb.append(System.lineSeparator());
		sb.append(u.getLastName());
		sb.append(System.lineSeparator());
		sb.append(u.getEmail());
		sb.append(System.lineSeparator());
		sb.append(u.getPassword());
		sb.append(System.lineSeparator());

		return sb.toString().trim();
	}

	@Override
	public String deleteUser(User u, String username) {
		u = dummyUser;
		
		if(username == null || username.isBlank()) {
			return "Username is invalid";
		}
		
		if(u == null) {
			return "User not authorized";
		}
		
		User u1 = users.stream().filter(e -> e.getUsername().equals(username)).findFirst().orElse(null);

		if(u1 != null) {
			if(!u1.getUsername().equals(u.getUsername())) {
				return "You don't have the permission to delete";
			}else {
				boolean isDeleted = users.remove(u1);
				if (isDeleted) {
					return "Successfully Deleted";
				}
			}
		}

		return "You can't delete";
	}

	@Override
	public String updateUser(String username, String password, String firstName, String lastName, String email) {
		if (username == null || username.isBlank()) {
			return "Username is invalid";
		} else if (password == null || password.isBlank()) {
			return "Password is invalid";
		} else if (firstName == null || firstName.isBlank()) {
			return "First name is invalid";
		} else if (lastName == null || lastName.isBlank()) {
			return "Last name is invalid";
		} else if (email == null || email.isBlank()) {
			return "Email is invalid";
		}
		User u = users.stream().filter(e -> e.getUsername().equals(username)).findFirst().orElse(null);
		if (u != null) {
			u.setEmail(email);
			u.setFirstName(firstName);
			u.setLastName(lastName);
			u.setPassword(password);
			u.setUsername(username);
		}
		return "Successfully Updated";
	}

	@Override
	public String buyGame(Game g, String username) {
		User u = users.stream().filter(e -> e.getUsername().equals(username)).findFirst().orElse(null);
		if (u != null && g != null) {
			u.addGames(g);
			return "Successfully bought game";
		}

		return "User not found";

	}

	@Override
	public String showBoughtGames(String username) {
		StringBuilder sb = new StringBuilder();
		User u = users.stream().filter(e -> e.getUsername().equals(username)).findFirst().orElse(null);
		if (u != null) {
			u.addGames(dummyGame);
			Set<Game> userGames = u.getGames();
			for (Game game : userGames) {
				sb.append(game.getName());
				sb.append(System.lineSeparator());
			}
			return sb.toString().trim();
		}
		return "User not found";
	}

	@Override
	public String buySubscription(Subscription s, String username) {
		User u = users.stream().filter(e -> e.getUsername().equals(username)).findFirst().orElse(null);
		if (u != null) {
			u.setSubscription(s);
			return "Successfully bought subscription";
		}
		return "User not found";
	}
	
	

}
