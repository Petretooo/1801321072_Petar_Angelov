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
    public String getGenre() {
        return this.genre;
    }

    /**
     * @param genre 
     * @return
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return
     */
    public LocalDate getYear() {
        return this.year;
    }

    /**
     * @param year 
     * @return
     */
    public void setYear(LocalDate year) {
        this.year = year;
    }

    /**
     * @return
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * @param price 
     * @return
     */
    public void setPrice(double price) {
        this.price = price;
    }

}