package com.keyin.sprintOneFinalTerm.model;

import java.util.List;

public class Aircraft {

    private int id;
    private String type;
    private String airlineName;
    private int passengerCapacity;
    private City city;
    private List<Passenger> passengers;
    private List<Airport> airports;

    public Aircraft(){}

    public Aircraft(int id, String type, String airlineName, int passengerCapacity, City city, List<Passenger> passengers, List<Airport> airports) {
        this.id = id;
        this.type = type;
        this.airlineName = airlineName;
        this.passengerCapacity = passengerCapacity;
        this.city = city;
        this.passengers = passengers;
        this.airports = airports;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public List<Airport> getAirports() {
        return airports;
    }

    public void setAirports(List<Airport> airports) {
        this.airports = airports;
    }
}
