package com.example.demo.repositories;

import com.example.demo.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.Optional;

public interface CityRepository  extends JpaRepository<City, Long>, JpaSpecificationExecutor<City> {

    List<City> findAllByName(String name);

    Optional<City> findById(Long id);

    Optional<City> findByPopulation(int population);
}
