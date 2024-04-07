package org.example.arge;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int  batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public String startEngine() {
        return "Electrikle arabanın motoru çalıtırıldı.";
    }

    @Override
    public String drive() {
        runEngine();
        return "Electrikli araba gidiyor.";
    }

    @Override
    public void printClassName() {
        super.printClassName();
    }

    @Override
    public String toString() {
        return super.toString()+"ElectricCar{" +
                "avgKmPerCharge=" + avgKmPerCharge +
                ", batterySize=" + batterySize +
                '}';
    }
}
