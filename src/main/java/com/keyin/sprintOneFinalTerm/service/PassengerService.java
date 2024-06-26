package com.keyin.sprintOneFinalTerm.service;

import com.keyin.sprintOneFinalTerm.model.Aircraft;
import com.keyin.sprintOneFinalTerm.model.City;
import com.keyin.sprintOneFinalTerm.model.Passenger;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PassengerService {

    private List<Passenger> passengers = new ArrayList<>();
    private int passengerIdCounter = 1;

    // Add a passenger
    public Passenger addPassenger(Passenger passenger) {
        passenger.setId(passengerIdCounter++);
        passengers.add(passenger);
        return passenger;
    }

    // Delete a passenger
    public  boolean deletePassenger(int id) {
        return passengers.removeIf(passenger -> passenger.getId() == id);
    }

    // Get a passenger by id
    public Passenger getPassengerById(int id) {
        for (Passenger passenger : passengers) {
            if (passenger.getId() == id) {
                return passenger;
            }
        }
        return null;
    }

    // Get all passengers
    public List<Passenger> getAllPassengers() {
        return passengers;
    }

    // Add a city to a passenger
    public Passenger addCityToPassenger(int passengerId, City city) {
        Passenger passenger = getPassengerById(passengerId);
        if (passenger != null) {
            passenger.setCity(city);
        }
        return passenger;
    }

    // Add aircraft to a passenger
    public Passenger addAircraftsToPassenger(int passengerId, Aircraft aircraft) {
        Passenger passenger = getPassengerById(passengerId);
        if (passenger != null) {
            List<Aircraft> aircraftList = passenger.getAircraft();
            if (aircraftList == null) {
                aircraftList = new ArrayList<>();
            }
            aircraftList.add(aircraft);
            passenger.setAircraft(aircraftList);
        }
        return passenger;
    }

    // Update a passenger
    public Passenger updatePassenger(int id, Passenger updatedPassenger) {
        Passenger existingPassenger = getPassengerById(id);
        if (existingPassenger != null) {
            existingPassenger.setFirstName(updatedPassenger.getFirstName());
            existingPassenger.setLastName(updatedPassenger.getLastName());
            existingPassenger.setPhoneNumber(updatedPassenger.getPhoneNumber());
            existingPassenger.setCity(updatedPassenger.getCity()); // Assuming city should be updated
            existingPassenger.setAircraft(updatedPassenger.getAircraft()); // Assuming aircraft should be updated
        }
        return existingPassenger;
    }
}
