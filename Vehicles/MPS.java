package edu.softuni.polymorphism.Vehicles;

public abstract class MPS {
    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;


    public MPS(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumption(fuelConsumption);
        this.setTankCapacity(tankCapacity);
    }

    public double getTankCapacity() {
        return this.tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }
    public double getFuelQuantity() {
        return this.fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        if (fuelQuantity < 0) {
            throw new IllegalArgumentException("Fuel quantity cannot be a negative number.");
        }
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return this.fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        if (fuelConsumption < 0) {
            throw new IllegalArgumentException("Fuel consumption cannot be a negative number.");
        }
        this.fuelConsumption = fuelConsumption;
    }
    public double drive(double km) {
        double razhod = km * this.getFuelConsumption();

        if (razhod > this.getFuelQuantity()) {
            return -1.0;
        }
        this.setFuelQuantity(this.getFuelQuantity() - razhod);
        return razhod;
    }
}
