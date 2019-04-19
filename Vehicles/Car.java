package edu.softuni.polymorphism.Vehicles;

public class Car extends MPS {

    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public double drive(double km){
        double razhod = km*super.getFuelConsumption() + km*0.9;

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
