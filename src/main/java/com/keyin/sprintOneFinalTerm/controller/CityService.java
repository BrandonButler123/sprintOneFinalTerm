package com.keyin.sprintOneFinalTerm.controller;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityService {

    private List<City> cities = new ArrayList<>();
    private int cityIdCounter = 1;
    private int airportIdCounter = 1;

    // Add a city
    public City addCity(City city) {
        city.setId(cityIdCounter++);
        cities.add(city);
        return city;
    }


    // Delete a city
    public City deleteCity(int id) {
        cities.removeIf(city -> city.getId() == id);
        return null;
    }

    // Get a city by id
    public City getCityById(int id) {
        for (City city : cities) {
            if (city.getId() == id) {
                return city;
            }
        }
        return null;
    }

    // Get all cities
    public List<City> getAllCities() {
        return cities;
    }

//  Add an airport to a city
    public City addAirportToCity(int cityId, Airport airport) {
        City city = getCityById(cityId);
        if (city != null) {
            List<Airport> airports = city.getAirports();
            if (airports == null) {
                airports = new ArrayList<>();
            }
            airports.add(airport);
            city.setAirports(airports);
        }
        return city;
    }

}
