package edu.softuni.polymorphism.Ferrari;

public class Ferrari implements Cars {
    private static final String FERRARI_MODEL = "488-Spider";
    private String driverName;

    public Ferrari(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public String useBrakes() {
        return "Brakes!";
    }

    @Override
    public String pushTheGas() {
        return "Zadu6avam sA!";
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s", FERRARI_MODEL,
                useBrakes(), pushTheGas(), this.driverName);
    }
}
