package com.keyin.sprintOneFinalTerm.model;

import java.util.List;

public class City {

    private int id;
    private String city;
    private String province;
    private int population;
    private List<Airport> airports;

    public City() {}

    public City(int id, String city, String province, int population, List<Airport> airports) {
        this.id = id;
        this.city = city;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
