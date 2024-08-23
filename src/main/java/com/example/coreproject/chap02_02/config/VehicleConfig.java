package com.example.coreproject.chap02_02.config;

import com.example.coreproject.chap02_02.vehicle.Car;
import com.example.coreproject.chap02_02.vehicle.Engine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VehicleConfig {

    @Bean
    public Engine engine() {
        return new Engine();
    }

    @Bean
    public Car car() {
        Car car = new Car(engine()); // 생성자 주입 활용

//        Car car = new Car();
//        car.setEngine(engine()); // setter 주입 활용

        return car;
    }
}
