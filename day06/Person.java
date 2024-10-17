package day06;

import java.io.*;
import java.util.*;

public class Person {
    
    private Long id;
    private String firstName;
    private String lastName;
    private double salary;
    private Date dob;

    // Constructor
    
    public Person(Long id, String firstName, String lastName, double salary, Date dob) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.dob = dob;
    }

    // Getters & setters
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", first name=" + firstName + ", last name =" + lastName + ", salary=" + salary + ", date of birth=" + dob + "]";
       
       // csv format
       // return id + ", " + name + "," + description + ", " + category;
    }

    public void print() {
        System.out.println(toString());
    }


}
