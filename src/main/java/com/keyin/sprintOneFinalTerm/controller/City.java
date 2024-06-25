package com.keyin.sprintOneFinalTerm.controller;

import com.keyin.sprintOneFinalTerm.controller.Airport;

import java.util.List;

public class City {

    private int id;
    private String name;
    private String province;
    private int population;
    private List<Airport> airports;

    public City() {}

    public City(int id, String name, String province, int population, List<Airport> airports) {
        this.id = id;
        this.name = name;
        this.province = province;
        this.population = population;
        this.airports = airports;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public List<Airport> getAirports() {
        return airports;
    }

    public void setAirports(List<Airport> airports) {
        this.airports = airports;
    }
}
