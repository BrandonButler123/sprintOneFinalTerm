package com.keyin.sprintOneFinalTerm.controller;

import com.keyin.sprintOneFinalTerm.model.Passenger;
import com.keyin.sprintOneFinalTerm.model.Aircraft;
import com.keyin.sprintOneFinalTerm.service.AircraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aircrafts")
public class AircraftController {

    @Autowired
    private AircraftService aircraftService;

    @PostMapping
    public Aircraft addAircraft(@RequestBody Aircraft aircraft) {
        return aircraftService.addAircraft(aircraft);
    }

    @GetMapping("/{id}")
    public Aircraft getAircraftById(@PathVariable int id) {
        return aircraftService.getAircraftById(id);
    }

    @GetMapping
    public List<Aircraft> getAllAircraft() {
        return aircraftService.getAllAircraft();
    }

    @DeleteMapping("/{id}")
    public boolean deleteAircraft(@PathVariable int id) {
        return aircraftService.deleteAircraft(id);
    }

    @PostMapping("/{aircraftId}/passengers")
    public void addPassengerToAircraft(@PathVariable int aircraftId, @RequestBody Passenger passenger) {
        aircraftService.addPassengerToAircraft(aircraftId, passenger);
    }

    @PutMapping("/{id}")
    public Aircraft updateAircraft(@PathVariable int id, @RequestBody Aircraft updatedAircraft) {
        return aircraftService.updateAircraft(id, updatedAircraft);
    }

    @DeleteMapping("/{aircraftId}/passengers")
    public void removePassengerFromAircraft(@PathVariable int aircraftId, @RequestBody Passenger passenger) {
        aircraftService.removePassengerFromAircraft(aircraftId, passenger);
    }
}
