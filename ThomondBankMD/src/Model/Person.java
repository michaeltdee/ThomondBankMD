package Model;

import java.time.LocalDate;

public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected String address;
    protected LocalDate dob;
    Person(String firstName, String lastName, String address, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String toString() {
        return firstName + " " + lastName + " " + address + " " + dob.toString();
    }
}

