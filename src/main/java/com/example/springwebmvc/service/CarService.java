package com.example.springwebmvc.service;

import com.example.springwebmvc.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private static final List<Car> CARS = List.of(
            new Car("Fiat","Silver","V4"),
            new Car("Renault","Black","V6"),
            new Car("Proton","Blue","V8"),
            new Car("Lada","White","V10"),
            new Car("Geely","NoColor","V0"));

    public List<Car> getAllCars(Integer count) {
        return count == null || count >= CARS.size() ? CARS : CARS.subList(0, count);
    }
}
