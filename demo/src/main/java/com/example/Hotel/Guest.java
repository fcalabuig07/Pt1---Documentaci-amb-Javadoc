package com.example.Hotel;

/**
 * Represents a guest in a hotel, extending the base characteristics of a person.
 * This class includes information about the guest's nationality.
 * @author Ferran Calabuig
 */
public class Guest extends Person {

    private String nationality;

    /**
     * Default constructor for Guest.
     */
    public Guest() {
    }

    /**
     * Constructs a Guest with specified nationality.
     * @param nationality The nationality of the guest.
     */
    public Guest(String nationality) {
        this.nationality = nationality;
    }

    /**
     * Returns the nationality of the guest.
     * @return The nationality of the guest.
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the nationality of the guest.
     * @param nationality The new nationality of the guest.
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

}