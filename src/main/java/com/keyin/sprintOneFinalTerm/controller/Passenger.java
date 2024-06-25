package com.keyin.sprintOneFinalTerm.controller;

public class Passenger {

    public int id;
    public String firstName;
    public String lastName;
    public String phoneNumber;
    public City city;


    public Passenger(int id, String firstName, String lastName, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public Passenger(int id, String firstName, String lastName, String phoneNumber, City city) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.city = city;
    }
}
