package org.example.arge;

public class HybridCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

//    public HybridCar(double avgKmPerLitre, int batterySize, int cylinders) {
//        this.avgKmPerLitre = avgKmPerLitre;
//        this.batterySize = batterySize;
//        this.cylinders = cylinders;
//    }


    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String startEngine() {
        return "Hybrit Car engine started";
    }

    @Override
    public String drive() {
        runEngine();
        return "Hiybrit car driving.";
    }

    @Override
    public void printClassName() {
        super.printClassName();
    }

    @Override
    public String toString() {
        return super.toString()+"HybridCar{" +
                "avgKmPerLitre=" + avgKmPerLitre +
                ", batterySize=" + batterySize +
                ", cylinders=" + cylinders +
                '}';
    }
}
