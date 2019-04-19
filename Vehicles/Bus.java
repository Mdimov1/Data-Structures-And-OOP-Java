package edu.softuni.polymorphism.Vehicles;

public class Bus extends MPS{
    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    public double driveWithPeople(double km){
        double razhod = km*super.getFuelConsumption() + km*1.4;

        if (razhod > super.getFuelQuantity()){
            return -1.0;
        }
        super.setFuelQuantity(super.getFuelQuantity() - razhod);
        return 0;
    }
    public double driveWithoutPeople(double km){
        double razhod = km*super.getFuelConsumption();

        if (razhod > super.getFuelQuantity()){
            return -1.0;
        }
        super.setFuelQuantity(super.getFuelQuantity() - razhod);
        return razhod;
    }

    public void refuel(double litres){
        super.setFuelQuantity(getFuelQuantity() + litres);
    }
}
