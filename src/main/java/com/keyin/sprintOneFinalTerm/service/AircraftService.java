package com.keyin.sprintOneFinalTerm.service;

import com.keyin.sprintOneFinalTerm.model.Passenger;
import com.keyin.sprintOneFinalTerm.model.Aircraft;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AircraftService {

    private List<Aircraft> aircrafts = new ArrayList<>();
    private int aircraftIdCounter = 1;

    // Add an aircraft
    public Aircraft addAircraft(Aircraft aircraft) {
        aircraft.setId(aircraftIdCounter++);
        aircrafts.add(aircraft);
        return aircraft;
    }

    // Delete an aircraft
    public boolean deleteAircraft(int id) {
        return aircrafts.removeIf(aircraft -> aircraft.getId() == id);
    }

    // Get an aircraft by id
    public Aircraft getAircraftById(int id) {
        for (Aircraft aircraft : aircrafts) {
            if (aircraft.getId() == id) {
                return aircraft;
            }
        }
        return null;
    }

    // Get all aircraft
    public List<Aircraft> getAllAircraft() {
        return aircrafts;
    }

    // Add a passenger to an aircraft
    public void addPassengerToAircraft(int aircraftId, Passenger passenger) {
        Aircraft aircraft = getAircraftById(aircraftId);
        if (aircraft != null) {
            aircraft.addPassenger(passenger);
        }
    }

    // Remove a passenger from an aircraft
    public void removePassengerFromAircraft(int aircraftId, Passenger passenger) {
        Aircraft aircraft = getAircraftById(aircraftId);
        if (aircraft != null) {
            aircraft.removePassenger(passenger);
        }
    }
}

