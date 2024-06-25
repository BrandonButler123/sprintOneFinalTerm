package com.keyin.sprintOneFinalTerm.controller;

public class Airport {
    public int id;
    public String name;
    public String code;

    public Airport(int id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Airport ID: " + id + "\nAirport name: " + name + "\nAirport code: " + code;
    }

    public static void main(String[] args) {
        Airport YYT = new Airport(1, "St. John's International Airport", "YYT");
        System.out.println(YYT);

    }

}
