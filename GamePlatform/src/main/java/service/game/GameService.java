package service.game;

import org.joda.time.LocalDate;

import model.Game;

public interface GameService {
	
	public void createGame(Game g);
	public void deleteGame(String gamaeName);
	public void updateGame(String gameName,  String genre, LocalDate date, double price);
	public Game showGame(String gameName);

}
