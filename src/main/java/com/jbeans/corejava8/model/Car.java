package com.jbeans.corejava8.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
@Table(name="car_data")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "Cust_id", nullable = false)
    private Long id;
    @Column(name="mpg")
    int mpg;
    @Column(name="cylinders")
    int cylinders;
    @Column(name="displacement")
    int displacement;
    @Column(name="horsepower")
    int horsepower;
    @Column(name="weight")
    int weight;
    @Column(name="acceleration")
    double acceleration;
    @Column(name="model_year")
    int model_year;
    @Column(name="origin")
    String origin;
    @Column(name="Name")
    String Name;
    @Column(name="Model")
    String Model;
    @Column(name="Price")
    double Price;


}
