package model;

import java.util.*;

/**
 * 
 */
public class Subscription {

    /**
     * Default constructor
     */
    public Subscription() {
    }

    /**
     * 
     */
    private String type;

    /**
     * 
     */
    private boolean active;

    /**
     * 
     */
    private User user;

    /**
     * @return
     */
    public String getType() {
        return this.type;
    }

    /**
     * @param type 
     * @return
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return
     */
    public boolean getActive() {
        return this.active;
    }

    /**
     * @param active 
     * @return
     */
    public void setActive(boolean active) {
        this.active = active;
    }

}