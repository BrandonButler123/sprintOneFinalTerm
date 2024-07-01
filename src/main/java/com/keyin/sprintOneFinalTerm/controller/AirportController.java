package com.keyin.sprintOneFinalTerm.controller;

import com.keyin.sprintOneFinalTerm.model.Airport;
import com.keyin.sprintOneFinalTerm.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/airports")
public class AirportController {

    @Autowired
    private AirportService airportService;

    @PostMapping
    public Airport addAirport(@RequestBody Airport airport) {
        return airportService.addAirport(airport);
    }

    @DeleteMapping("/{id}")
    public boolean deleteAirport(@PathVariable("id") int id) {
        return airportService.deleteAirport(id);
    }

    @GetMapping("/{id}")
    public Airport getAirportById(@PathVariable int id) {
        return airportService.getAirportById(id);
    }

    @GetMapping
    public List<Airport> getAllAirports() {
        return airportService.getAllAirports();
    }

    @PutMapping("/{id}")
    public Airport updateAirport(@PathVariable int id, @RequestBody Airport airport) {
        return airportService.updateAirport(id, airport);
    }
}
