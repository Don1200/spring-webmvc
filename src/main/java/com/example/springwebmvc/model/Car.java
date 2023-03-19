package com.example.springwebmvc.model;

public class Car {
    String model;
    String color;
    String engine;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Car() {
    }

    public Car(String model, String color, String engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }







}
