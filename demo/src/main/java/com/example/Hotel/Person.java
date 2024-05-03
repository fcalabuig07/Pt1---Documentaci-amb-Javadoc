package com.example.Hotel;

/**
 * Represents a person with a unique identifier and a name. This class serves as a base class
 * for other specific types of people in a hotel, such as guests or managers.
 * @author Ferran Calabuig Herrero
 */
public abstract class Person {

    private String name;
    private String identifier;

    /**
     * Default constructor for Person.
     * Creates a person instance without initializing name or identifier.
     */
    public Person() {
    }

    /**
     * Constructs a Person with a specified name and identifier.
     * @param name The name of the person.
     * @param identifier The unique identifier of the person.
     */
    public Person(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }

    /**
     * Returns the name of the person.
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the person.
     * @param name The new name for the person.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the unique identifier of the person.
     * @return The identifier of the person.
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the identifier of the person.
     * @param identifier The new identifier for the person.
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

}