package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    CarRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Car car;
        car = new Car("2019", "Honda", "Civic");
        repository.save(car);

        car = new Car("2020", "Porche", "Boxter");
        repository.save(car);

        car = new Car("2014", "Toyota", "Corolla");
        repository.save(car);
    }
}
