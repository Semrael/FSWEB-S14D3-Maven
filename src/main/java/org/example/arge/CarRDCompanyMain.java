package org.example.arge;

public class CarRDCompanyMain {
    public static void main(String[] args) {
        CarSkeleton carSkeleton=new CarSkeleton("X","X'in iskellti biri hafif sağa biri sola yatmış iki çubuktan oluşuyor.");
        System.out.println(carSkeleton);
        System.out.println(carSkeleton.runEngine());
        System.out.println(carSkeleton.drive());
        System.out.println(carSkeleton.startEngine());
        CarSkeleton hybritCar=new HybridCar("Y","Hibrit araba",12,23,1);
        System.out.println(hybritCar);
        System.out.println(hybritCar.startEngine());
        System.out.println(hybritCar.drive());
        System.out.println(hybritCar.runEngine());
        CarSkeleton electicCar=new ElectricCar("Electrik","tek ihtiyacı elektrik",12,23);
        System.out.println(electicCar);
        System.out.println(electicCar.runEngine());
        System.out.println(electicCar.drive());
        System.out.println(electicCar.startEngine());
        CarSkeleton gasCar=new GasPoweredCar("Gazla çalışır","Gaz gerekiyor",1,234);
        System.out.println(gasCar);
        System.out.println(gasCar.startEngine());
        System.out.println(gasCar.drive());
        System.out.println(gasCar.runEngine());
        gasCar.printClassName();
    }

}
