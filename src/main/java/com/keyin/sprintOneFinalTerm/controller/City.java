package com.keyin.sprintOneFinalTerm.controller;

import java.util.List;

public class City {

    public int id;
    public String name;
    public String province;
    public int population;

    public City(int id, String name, String province, int population) {
        this.id = id;
        this.name = name;
        this.province = province;
        this.population = population;
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
}
