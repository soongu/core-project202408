package com.example.coreproject.chap02_02.vehicle;

import com.example.coreproject.chap02_02.config.VehicleConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void startEngineTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(VehicleConfig.class);
        Car car = context.getBean(Car.class);
        car.startEngine();
    }

}