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
        // TODO implement here
        return "";
    }

    /**
     * @param usernaem 
     * @return
     */
    public void setUsername(String usernaem) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getPassword() {
        // TODO implement here
        return "";
    }

    /**
     * @param pass 
     * @return
     */
    public void setPassword(String pass) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getFirstName() {
        // TODO implement here
        return "";
    }

    /**
     * @param firstName 
     * @return
     */
    public void setFirstName(String firstName) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getLastName() {
        // TODO implement here
        return "";
    }

    /**
     * @param lastName 
     * @return
     */
    public void setLastName(String lastName) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getEmail() {
        // TODO implement here
        return "";
    }

    /**
     * @param email 
     * @return
     */
    public void setEmail(String email) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Set<Game> getGames() {
        // TODO implement here
        return null;
    }

    /**
     * @param game 
     * @return
     */
    public void addGames(Game game) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Subscription getSubscription() {
        // TODO implement here
        return null;
    }

    /**
     * @param subscription 
     * @return
     */
    public void setSubscription(Subscription subscription) {
        // TODO implement here
    }

}