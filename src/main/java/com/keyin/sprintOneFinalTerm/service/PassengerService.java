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
}
