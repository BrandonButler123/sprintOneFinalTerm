package com.keyin.sprintOneFinalTerm.controller;

import java.util.List;

public class Aircraft {

    public int id;
    public String type;
    public String airlineName;
    public int passengerCapacity;
    public City city;
    private List<Passenger> passengers;
    private List<Airport> airports;

    public Aircraft(int id, String type, String airlineName, int passengerCapacity) {
        this.id = id;
        this.type = type;
        this.airlineName = airlineName;
        this.passengerCapacity = passengerCapacity;
    }

    public Aircraft(int id, String type, String airlineName, int passengerCapacity, City city) {
        this.id = id;
        this.type = type;
        this.airlineName = airlineName;
        this.passengerCapacity = passengerCapacity;
        this.city = city;
    }

    public Aircraft(int id, String type, String airlineName, int passengerCapacity, City city, List<Passenger> passengers, List<Airport> airports) {
        this.id = id;
        this.type = type;
        this.airlineName = airlineName;
        this.passengerCapacity = passengerCapacity;
        this.city = city;
        this.passengers = passengers;
        this.airports = airports;
    }
}
