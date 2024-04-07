package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine=true;
        this.wheels=4;
    }
    public int getCylinders(){
        return this.cylinders;
    }
    public String getName(){
        return this.name;
    }

    public String startEngine() {
        String message = "the car's engine is starting";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message;
    }
    public String accelerate() {
        String message = "the car is accelerating";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message;
    }

    public String brake() {
        String message = "the car is braking";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message;
    }
    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Car car)) return false;
    return cylinders == car.cylinders && Objects.equals(name, car.name);
}

@Override
public int hashCode() {
    return Objects.hash(cylinders, name);
}
}
