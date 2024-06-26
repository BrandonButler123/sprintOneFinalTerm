package com.keyin.sprintOneFinalTerm.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties({"city", "airports"})
public class Aircraft {

    private int id;
    private String type;
    private String airlineName;
    private int passengerCapacity;
    private City city;
    private List<Passenger> passengers;

    public Aircraft() {
        // Initialize lists to avoid null pointer exceptions
        this.passengers = new ArrayList<>();
    }

    public Aircraft(int id, String type, String airlineName, int passengerCapacity, City city, List<Passenger> passengers, List<Airport> airports) {
        this.id = id;
        this.type = type;
        this.airlineName = airlineName;
        this.passengerCapacity = passengerCapacity;
        this.city = city;
        this.passengers = (passengers != null) ? passengers : new ArrayList<>();
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
        this.passengers = (passengers != null) ? passengers : new ArrayList<>();
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public void removePassenger(Passenger passenger) {
        this.passengers.remove(passenger);
    }
}
