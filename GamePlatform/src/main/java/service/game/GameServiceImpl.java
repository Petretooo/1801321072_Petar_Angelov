package service.game;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;

import model.Game;

public class GameServiceImpl implements GameService {

	List<Game> games;

	public GameServiceImpl() {
		games = new ArrayList<>();
	}

	@Override
	public void createGame(Game g) {

		games.add(g);
	}

	@Override
	public void deleteGame(String gamaeName) {
		Game g = games.stream().filter(e -> e.getName().equals(gamaeName)).findFirst().orElse(null);
		if(g != null) {
			games.remove(g);
		}
	}

	@Override
	public void updateGame(String gameName,  String genre, LocalDate date, double price) {
		Game g = games.stream().filter(e -> e.getName().equals(gameName)).findFirst().orElse(null);
		if(g != null) {
			g.setName(gameName);
			g.setGenre(genre);
			g.setYear(date);
			g.setPrice(price);
		}
	}

	@Override
	public Game showGame(String gameName) {
		return games.stream().filter(e -> e.getName().equals(gameName)).findFirst().orElse(null);

	}

}
