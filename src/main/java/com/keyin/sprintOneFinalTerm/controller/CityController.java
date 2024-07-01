package com.keyin.sprintOneFinalTerm.controller;

import com.keyin.sprintOneFinalTerm.model.Airport;
import com.keyin.sprintOneFinalTerm.model.City;
import com.keyin.sprintOneFinalTerm.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {

    @Autowired
    private CityService cityService;

    @PostMapping
    public City addCity(@RequestBody City city) {
        return cityService.addCity(city);
    }

    @DeleteMapping("/{id}")
    public boolean deleteCity(@PathVariable("id") int id) {
        return cityService.deleteCity(id);
    }

    @GetMapping("/{id}")
    public City getCityById(@PathVariable int id) {
        return cityService.getCityById(id);
    }

    @GetMapping
    public List<City> getAllCities() {
        return cityService.getAllCities();
    }

    @PutMapping("/{id}")
    public City updateCity(@PathVariable int id, @RequestBody City cityDetails) {
        City existingCity = cityService.getCityById(id);
        if (existingCity == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "City not found with id: " + id);
        }

        // Update city details based on cityDetails object
        existingCity.setCity(cityDetails.getCity()); // 'city' instead of 'name'
        existingCity.setProvince(cityDetails.getProvince()); // 'province' instead of 'state'
        existingCity.setPopulation(cityDetails.getPopulation());

        return cityService.updateCity(existingCity);
    }

    @PostMapping("/{cityId}/airports")
    public City addAirportToCity(@PathVariable int cityId, @RequestBody Airport airport) {
        return cityService.addAirportToCity(cityId, airport);
    }
}
