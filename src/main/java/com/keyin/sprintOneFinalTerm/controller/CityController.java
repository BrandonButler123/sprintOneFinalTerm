package com.keyin.sprintOneFinalTerm.controller;

import com.keyin.sprintOneFinalTerm.model.Airport;
import com.keyin.sprintOneFinalTerm.model.City;
import com.keyin.sprintOneFinalTerm.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public City deleteCity(@PathVariable("id") int id) {
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

    @PostMapping("/{cityId}/airports")
    public City addAirportToCity(@PathVariable int cityId, @RequestBody Airport airport) {
        return cityService.addAirportToCity(cityId, airport);
    }
}
