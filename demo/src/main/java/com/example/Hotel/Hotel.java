package com.example.Hotel;

/**
 * Represents a hotel, providing basic information such as the hotel's name, address, website, and category.
 * The category is typically expressed as the number of stars the hotel has.
 * @author Ferran Calabuig Herrero
 */
public class Hotel {

    private String name;
    private String address;
    private String web;
    private String category;

    /**
     * Default constructor that creates an instance of Hotel without initializing its properties.
     */
    public Hotel() {
    }

    /**
     * Constructs a Hotel with specified parameters to initialize its properties.
     * @param name The name of the hotel.
     * @param address The address of the hotel.
     * @param web The website of the hotel.
     * @param category The category of the hotel, typically expressed as the number of stars.
     */
    public Hotel(String name, String address, String web, String category) {
        this.name = name;
        this.address = address;
        this.web = web;
        this.category = category;
    }

    /**
     * Returns the name of the hotel.
     * @return The name of the hotel.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the hotel.
     * @param name The new name of the hotel.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the address of the hotel.
     * @return The address of the hotel.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address of the hotel.
     * @param address The new address of the hotel.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Returns the website of the hotel.
     * @return The website of the hotel.
     */
    public String getWeb() {
        return web;
    }

    /**
     * Sets the website of the hotel.
     * @param web The new website of the hotel.
     */
    public void setWeb(String web) {
        this.web = web;
    }

    /**
     * Returns the category of the hotel, typically expressed as the number of stars.
     * @return The category of the hotel.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the category of the hotel.
     * @param category The new category of the hotel.
     */
    public void setCategory(String category) {
        this.category = category;
    }
}