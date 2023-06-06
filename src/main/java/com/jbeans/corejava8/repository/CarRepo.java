package com.jbeans.corejava8.repository;

import com.jbeans.corejava8.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepo extends JpaRepository<Car,Long> {
    public List<Car>  findByOrigin(String name);
}
