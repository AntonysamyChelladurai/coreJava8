package com.jbeans.corejava8.service;

import com.jbeans.corejava8.model.Car;
import com.jbeans.corejava8.repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class CarDetailService {
    @Autowired
    CarRepo carRepo;

    public List<Car> getAllCar(){
         List<Car> car_list= carRepo.findAll();
        return car_list;
    }
    public List<Car> getTopThreeCar(){
        List<Car> top3_car_list= carRepo.findAll().stream()
                .sorted(Comparator.comparing(Car::getPrice).reversed())
                .limit(3)
                .collect(Collectors.toList());
        return top3_car_list;
    }

    public List<Car> getFilteredCar(){
        List<Car> filtered_car_list= carRepo.findAll().stream()
                .filter(car -> car.getName().equals("toyota"))
                .sorted(Comparator.comparing(Car::getPrice).reversed())
                .limit(3)
                .collect(Collectors.toList());
        return filtered_car_list;
    }

    public List<Car> getQueryFilterCar(String origin){
        List<Car> sqlFilter= carRepo.findByOrigin(origin);
        return sqlFilter;
    }

}

