package com.example.demo.services;

import com.example.demo.dto.ApiResponse;
import com.example.demo.entities.City;
import com.example.demo.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServices {

    private final CityRepository cityRepository;

    @Autowired
    public CityServices(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public ApiResponse getAllCities() {

        List<City> cities = cityRepository.findAll();

        return new ApiResponse().addData("cities", cities);
    }

    public Object addCity(City city) throws Exception {

        if (city == null || city.getName() == null) {
            throw new Exception("NO_ARGS");
        }

        try {
            return this.cityRepository.save(city);
        } catch (Exception e) {
            return e;
        }
    }


}
