package com.example.coreproject.chap02_02.vehicle;

public class Car {
    private Engine engine;

    public Car() {}

    // 생성자 주입
    public Car(Engine engine) {
        this.engine = engine;
    }

    // setter 주입
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void startEngine() {
        engine.start();
        System.out.println("Car is ready to go.");
    }
}
