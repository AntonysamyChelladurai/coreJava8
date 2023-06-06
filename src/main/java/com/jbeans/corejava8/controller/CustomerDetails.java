package com.jbeans.corejava8.controller;

import com.jbeans.corejava8.model.Car;
import com.jbeans.corejava8.service.CarDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CustomerDetails {
    @Autowired
    CarDetailService carDetailService;

    @GetMapping("/all")
    public List<Car> getCarList(){
        List<Car> car_data= carDetailService.getAllCar();
        return car_data;
    }

    @GetMapping("/top3")
    public List<Car> getTopThreeCarList(){
        List<Car> car_data= carDetailService.getTopThreeCar();
        return car_data;
    }
    @GetMapping("/filtered")
    public List<Car> getFilteredCarList(){
        List<Car> car_data= carDetailService.getFilteredCar();
        return car_data;
    }
    @PostMapping("/origin")
    public List<Car> getCarsByOrigin(@RequestBody Car car){
        List<Car> car_data= carDetailService.getQueryFilterCar(car.getOrigin());
        return car_data;
    }
}
