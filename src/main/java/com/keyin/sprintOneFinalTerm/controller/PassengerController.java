package com.keyin.sprintOneFinalTerm.controller;

import com.keyin.sprintOneFinalTerm.model.Passenger;
import com.keyin.sprintOneFinalTerm.service.PassengerService
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passengers")
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    @PostMapping
    public Passenger addPassenger(@RequestBody Passenger passenger) {
        return passengerService.addPassenger(passenger);
    }

    @DeleteMapping("/{id}")
    public boolean deletePassenger(@PathVariable("id") int id) {
        return passengerService.deletePassenger(id);
    }

    @GetMapping("/{id}")
    public Passenger getPassengerById(@PathVariable int id) {
        return passengerService.getPassengerById(id);
    }

    @GetMapping
    public List<Passenger> getAllPassengers() {
        return passengerService.getAllPassengers();
    }
}
