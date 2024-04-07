package org.example;

import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;
import org.junit.jupiter.api.Test;

public class Main {
    public static void main(String[] args) {

        Car car=new Car(8,"Base car");
        System.out.println(car);
        car.startEngine();
        car.accelerate();
        System.out.println("----------------------------");
      Car mitsubishi=new Mitsubishi(6, "Outlander VRX 4WD");
      System.out.println(mitsubishi);
      mitsubishi.accelerate();
        mitsubishi.brake();
        mitsubishi.startEngine();
     System.out.println("----------------------------");
        Car ford=new Ford(4,"Ford Falcon");
       System.out.println(ford);
ford.startEngine();
ford.brake();
       ford.accelerate();
        Car holden = new Holden(6, "Holden Commodore");
        holden.startEngine();
        holden.brake();
       holden.accelerate();

    }

}