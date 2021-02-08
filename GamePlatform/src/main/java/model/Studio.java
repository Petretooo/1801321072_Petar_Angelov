package model;

import java.util.*;

/**
 * 
 */
public class Studio {

    /**
     * Default constructor
     */
    public Studio() {
    }

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String country;

    /**
     * 
     */
    private Set<Game> games;

    /**
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param name 
     * @return
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * @param country 
     * @return
     */
    public void setCountry(String country) {
       this.country = country;
    }

    /**
     * @return
     */
    public Set<Game> getGames() {
        return this.games;
    }

    /**
     * @param game 
     * @return
     */
    public void addGames(Game game) {
        this.games.add(game);
    }

}