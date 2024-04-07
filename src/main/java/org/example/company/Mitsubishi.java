package org.example.company;

public class Mitsubishi extends Car{


    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return super.brake();
    }

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);

    }

////    @Override
////    public String startEngine() {
////        System.out.println("My Mitsubishi engine is starting.");
////        return getClass().getSimpleName();
////    }
////
////    @Override
////    public String accelerate() {
////        System.out.println("My Mitsh is accelerating ");
////        return getClass().getSimpleName();
////    }
////
//    @Override
//    public String brake() {
//        return getClass().getSimpleName();
//    }
}
