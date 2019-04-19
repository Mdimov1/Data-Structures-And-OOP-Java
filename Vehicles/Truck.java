package edu.softuni.polymorphism.Vehicles;

public class Truck extends MPS{

    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    public double drive(double km){
        double razhod = km*super.getFuelConsumption() + km*1.6;

        if (razhod > super.getFuelQuantity()){
            return -1.0;
        }
        super.setFuelQuantity(super.getFuelQuantity() - razhod);
        return razhod;
    }

    public int refuel(double litres){
        if(litres <= 0){
            return -1;
        }
        super.setFuelQuantity(getFuelQuantity() + litres*0.95);
        return 0;
    }
}
