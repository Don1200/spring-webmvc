package com.example.springwebmvc.controller;

import com.example.springwebmvc.model.Car;
import com.example.springwebmvc.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String getAllCars(Model model, @RequestParam(required = false) Integer count) {
        List<Car> carList = carService.getAllCars(count);
        model.addAttribute("carList", carList); // userList - название атрибута, которое мы передаем дальше
        // хтмл, а второе это значение, это то что  что мы получили: userList = userService.getAllUsers();
        return "cars";
    }
}
