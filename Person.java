package org.example;

public class Person {
    private String firstname;
    private String lastname;

    // Konstruktor
    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;

    }
// Methodn


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return String.join(" ", firstname, lastname);


    }
}
