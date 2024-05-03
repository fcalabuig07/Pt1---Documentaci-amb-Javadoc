package com.example.Hotel;

import java.util.Date;

/**
 * Represents a manager within a hotel, including their start date and years of experience.
 * The Manager class inherits from the Person class.
 * @author Ferran Calabuig Herrero
 */
public class Manager extends Person {

    private Date startDate;
    private int experience;

   /**
     * Default constructor for Manager.
     */
    public Manager(){

    }

    /**
     * Constructs a Manager with specified personal and professional information.
     * @param name The name of the manager.
     * @param identifier The unique identifier of the manager.
     * @param startDate The date when the manager started working at the hotel.
     * @param experience The number of years of experience the manager has in the sector.
     */
    public Manager(String name, String identifier, Date startDate, int experience) {
        super(name, identifier);
        this.startDate = startDate;
        this.experience = experience;
    }

    /**
     * Returns the start date of the manager's employment at the hotel.
     * @return The start date.
     */
    public Date getStartDate() {
        return startDate;
    }

        /**
     * Sets a new start date for the manager at the hotel.
     * @param startDate The new start date.
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * Returns the years of experience of the manager. 
     * @return The years of experience.
     */
    public int getExperience() {
        return experience;
    }

    
    /**
     * Sets the years of experience for the manager.
     * @param experience The new years of experience.
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }

}
