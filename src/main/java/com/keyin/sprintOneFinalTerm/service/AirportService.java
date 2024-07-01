package com.keyin.sprintOneFinalTerm.service;

import com.keyin.sprintOneFinalTerm.model.Airport;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AirportService {

    private List<Airport> airports = new ArrayList<>();
    private int airportIdCounter = 1;

    // Add an airport
    public Airport addAirport(Airport airport) {
        airport.setId(airportIdCounter++);
        airports.add(airport);
        return airport;
    }

    // Delete an airport
    public boolean deleteAirport(int id) {
        return airports.removeIf(airport -> airport.getId() == id);
    }

    // Get an airport by id
    public Airport getAirportById(int id) {
        for (Airport airport : airports) {
            if (airport.getId() == id) {
                return airport;
            }
        }
        return null;
    }

    // Get all airports
    public List<Airport> getAllAirports() {
        return airports;
    }

    // Update an airport
    public Airport updateAirport(int id, Airport updatedAirport) {
        Airport airport = getAirportById(id);
        if (airport != null) {
            airport.setName(updatedAirport.getName());
            airport.setCode(updatedAirport.getCode());
            airport.setCity(updatedAirport.getCity());
        }
        return airport;
    }
}
