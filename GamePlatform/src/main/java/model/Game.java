package model;

import java.util.*;

import org.joda.time.LocalDate;

/**
 * 
 */
public class Game {

    /**
     * Default constructor
     */
    public Game() {
    }
    
    public Game(String name, String genre, LocalDate year) {
    	this.name = name;
    	this.genre = genre;
    	this.year = year;
    }

	/**
     * 
     */
    private String name;

    /**
     * 
     */
    private String genre;

    /**
     * 
     */
    private LocalDate year;

    /**
     * 
     */
    private double price;

    /**
     * 
     */
    private User user;

    /**
     * 
     */
    private Studio studio;

    /**
     * @return
     */
    public String getName() {
        // TODO implement here
        return "";
    }

    /**
     * @param name 
     * @return
     */
    public void setName(String name) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getGenre() {
        // TODO implement here
        return "";
    }

    /**
     * @param genre 
     * @return
     */
    public void setGenre(String genre) {
        // TODO implement here
    }

    /**
     * @return
     */
    public LocalDate getYear() {
        // TODO implement here
        return null;
    }

    /**
     * @param year 
     * @return
     */
    public void setYear(LocalDate year) {
        // TODO implement here
    }

    /**
     * @return
     */
    public double getPrice() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @param price 
     * @return
     */
    public void setPrice(double price) {
        // TODO implement here
    }

}