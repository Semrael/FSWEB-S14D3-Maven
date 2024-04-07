package org.example.arge;

public class GasPoweredCar extends CarSkeleton{

    private double avgKmPerLitre;
    private int cylinders;


    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String startEngine() {
        return "Benzinle çalışan araba motoru çalıştı";
    }

    @Override
    public String drive() {
        runEngine();
        return "Benzinle çalışan arabayı sür.";
    }

    @Override
    public void printClassName() {
        super.printClassName();
    }

    @Override
    public String toString() {
        return super.toString()+"GasPoweredcar{" +
                "avgKmPerLitre=" + avgKmPerLitre +
                ", cylinders=" + cylinders +
                '}';
    }
}
