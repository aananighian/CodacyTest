package com.alex;

/**
 * A class for managing people
 */
public class PersonManager {

    /**
     * Update the first name of Person object
     *
     * @param id Unique identifier for the person being updated
     * @param firstName The first name to update the exist Person object's first name to
     * @return Updated person
     */
    public Person updateFirstName(int id, String firstName) {
        Person person = findPeron(id);
        person.setFirstName(firstName);
        return person;
    }

    private Person findPeron(int id) {
        return new Person("Bob", "Smith");
    }
}
