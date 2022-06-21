package com.example.demo.controllers;

import com.example.demo.dto.ApiResponse;
import com.example.demo.entities.City;
import com.example.demo.services.CityServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//POSTMAN requests:

// GET- http://localhost:8081/city/get/all

// Post - http://localhost:8081/city/add

@RestController
public class CityController {

    private final CityServices cityServices;

    @Autowired
    public CityController(CityServices cityServices) {
        this.cityServices = cityServices;
    }

    @GetMapping("city/get/all")
    public ApiResponse getAllCities() {
        return cityServices.getAllCities();
    }

    @PostMapping("city/add")
    public Object addDepartment(@RequestBody City city) throws Exception {
        return cityServices.addCity(city);
    }
}
