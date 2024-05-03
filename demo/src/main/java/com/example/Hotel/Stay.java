package com.example.Hotel;

import java.util.Date;

/**
 * Represents a stay at a hotel, characterized by a start date (arrival) and an end date (departure).
 * This class provides the functionality to manage the duration of a guest's stay in the hotel.
 * @author Ferran Calabuig
 */
public class Stay {

    private Date startDate;
    private Date endDate;

    /**
     * Default constructor for Stay.
     * Creates a stay instance without initializing start or end dates.
     */
    public Stay() {
    }

    /**
     * Constructs a Stay with specified start and end dates.
     * @param startDate The date of arrival at the hotel.
     * @param endDate The date of departure from the hotel.
     */
    public Stay(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /**
     * Returns the start date of the stay.
     * @return The date of arrival at the hotel.
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Sets the start date of the stay.
     * @param startDate The new start date (arrival date).
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * Returns the end date of the stay.
     * @return The date of departure from the hotel.
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Sets the end date of the stay.
     * @param endDate The new end date (departure date).
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

}