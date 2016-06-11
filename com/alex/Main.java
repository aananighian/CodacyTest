package com.alex;

/**
 * Entry point for the "application"
 */
public class Main {

    /**
     * The main method that starts the application
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        PersonManager personManager = new PersonManager();
        Person person = personManager.updateFirstName(1, "Jack");
        System.out.println(person.toString());
    }
}
