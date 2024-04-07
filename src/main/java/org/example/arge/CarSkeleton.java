package org.example.arge;

import org.example.company.Car;

public class CarSkeleton {
    private String name,description;
    public CarSkeleton(){}
    public CarSkeleton(String name,String description){
        this.name=name;
        this.description=description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine(){
        return "Motor çalıştırıldı.";
    }
    public String drive(){
        runEngine();
        return "Sürüş başladı";

    }


    protected  String runEngine(){
        return "Run Engine";
    }

    public void printClassName(){
        System.out.println(getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "CarSkeleton{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
