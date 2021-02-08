package model;

import java.util.*;

/**
 * 
 */
public class User {

    /**
     * Default constructor
     */
    public User() {
    }
    
    public User(String username, String password, String firstName, String lastName, String email) {
    	this.username = username;
    	this.password = password;
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.email = email;
    	games = new HashSet<>();
    }

    /**
     * 
     */
    private String firstName;

    /**
     * 
     */
    private String lastName;

    /**
     * 
     */
    private String username;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private Set<Game> games;

    /**
     * 
     */
    private Subscription subscription;

    /**
     * @return
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * @param usernaem 
     * @return
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @param pass 
     * @return
     */
    public void setPassword(String pass) {
        this.password = pass;
    }

    /**
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName 
     * @return
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * @param lastName 
     * @return
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return
     */
    public String getEmail() {
       return this.email;
    }

    /**
     * @param email 
     * @return
     */
    public void setEmail(String email) {
        this.email = email;
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

    /**
     * @return
     */
    public Subscription getSubscription() {
        return this.subscription;
    }

    /**
     * @param subscription 
     * @return
     */
    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

}