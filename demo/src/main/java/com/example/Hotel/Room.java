package com.example.Hotel;

/**
 * Represents a room within a hotel, characterized by a room number and a type.
 * This class details the attributes and functionalities specific to a hotel room.
 * @author Ferran Calabuig
 */
public class Room {

    private int number;
    private String tRoom;

    /**
     * Default constructor for Room.
     * Creates a room instance without initializing room number or type.
     */
    public Room() {
    }

    /**
     * Constructs a Room with a specified number and type.
     * @param number The room number.
     * @param tRoom The type of the room.
     */
    public Room(int number, String tRoom) {
        this.number = number;
        this.tRoom = tRoom;
    }

    /**
     * Returns the number of the room.
     * @return The room number.
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the number of the room.
     * @param number The new room number.
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Returns the type of the room.
     * @return The type of the room.
     */
    public String gettRoom() {
        return tRoom;
    }

    /**
     * Sets the type of the room.
     * @param tRoom The new room type.
     */
    public void settRoom(String tRoom) {
        this.tRoom = tRoom;
    }

}