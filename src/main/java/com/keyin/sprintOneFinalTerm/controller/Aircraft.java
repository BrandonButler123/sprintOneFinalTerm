package com.keyin.sprintOneFinalTerm.controller;

public class Aircraft {

    public int id;
    public String type;
    public String airlineName;
    public int passengerCapacity;

    public Aircraft(int id, String type, String airlineName, int passengerCapacity) {
        this.id = id;
        this.type = type;
        this.airlineName = airlineName;
        this.passengerCapacity = passengerCapacity;
    }
}
