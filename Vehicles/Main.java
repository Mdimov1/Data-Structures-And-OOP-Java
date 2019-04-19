package edu.softuni.polymorphism.Vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //CAR
        String[] carInfo = reader.readLine().split("[\\s+]");
        MPS car = new Car(Double.parseDouble(carInfo[1]), Double.parseDouble(carInfo[2]), Double.parseDouble(carInfo[3]));

        //TRUCK
        String[] truckInfo = reader.readLine().split("\\s+");
        MPS truck = new Truck(Double.parseDouble(truckInfo[1]), Double.parseDouble(truckInfo[2]), Double.parseDouble(truckInfo[3]));

        //BUS
        String[] busInfo = reader.readLine().split("\\s+");
        MPS bus = new Bus(Double.parseDouble(busInfo[1]), Double.parseDouble(busInfo[2]), Double.parseDouble(busInfo[3]));

        int n = Integer.parseInt(reader.readLine());

        Stream.Builder<String> result = Stream.builder();
        //DecimalFormat formatter = new DecimalFormat("#0.00");

        while (n-- > 0) {
            String[] commands = reader.readLine().split("[\\s+]");

            switch (commands[0]) {
                case "Drive":
                case "DriveEmpty":
                    if (commands[1].equals("Car")) {
                        double carDrived = car.drive(Double.parseDouble(commands[2]));

                        if (carDrived != -1.0) {
                            result.add("Car travelled ");
                            double km = Double.parseDouble(commands[2]);

                            if ((km * 10) % 10 == 0) {
                                int km1 = (int) km;
                                result.add(Integer.toString(km1));
                            } else {
                                result.add(Double.toString(km));
                            }
                            result.add(" km");
                        } else {
                            result.add("Car needs refueling");
                        }
                    } else if (commands[1].equals("Truck")) {
                        double truckDrived = ((Truck) truck).drive(Double.parseDouble(commands[2]));

                        if (truckDrived != -1.0){
                            result.add("Truck travelled ");
                            double km = Double.parseDouble(commands[2]);

                            if((km*10)%10 == 0){
                                int km1 = (int) km;
                                result.add(Integer.toString(km1));
                            } else{
                                result.add(Double.toString(km));
                            }
                            result.add(" km");
                        } else {
                            result.add("Truck needs refueling");
                        }

                    } else if (commands[1].equals("Bus")) {
                        double busDrived = ((Bus) bus).driveWithPeople(Double.parseDouble(commands[2]));

                        if (commands[0] == "DriveEmpty"){
                            busDrived = ((Bus) bus).driveWithoutPeople(Double.parseDouble(commands[2]));
                        }

                        if (busDrived != -1.0) {
                            result.add("Bus travelled ");
                            double km = Double.parseDouble(commands[2]);

                            if ((km * 10) % 10 == 0) {
                                int km1 = (int) km;
                                result.add(Integer.toString(km1));
                            } else {
                                result.add(Double.toString(km));
                            }
                            result.add(" km");
                        } else {
                            result.add("Bus needs refueling");
                        }
                    } else {
                        System.out.println("Input must contain 'Car' or 'Truck' or 'Bus'");
                    }
                    break;
                case "Refuel":
                    double litres = Double.parseDouble(commands[2]);

                    if(litres <= 0){
                        result.add("Fuel must be a positive number");
                    } else if (commands[1].equals("Car")) {
                        if((car.getFuelQuantity() + litres) > car.getTankCapacity()) {
                            result.add("Cannot fit fuel in tank");
                        } else {
                            ((Car) car).refuel(litres);
                        }
                    } else if (commands[1].equals("Truck")) {
                        if((truck.getFuelQuantity() + litres) > truck.getTankCapacity()) {
                            result.add("Cannot fit fuel in tank");
                        } else {
                            ((Truck) truck).refuel(litres);
                        }
                    }else if (commands[1].equals("Bus")) {
                        if((bus.getFuelQuantity() + litres) > bus.getTankCapacity()) {
                            result.add("Cannot fit fuel in tank");
                        } else {
                            ((Bus) bus).refuel(litres);
                        }
                    } else {
                        System.out.println("Input must contain 'Car' or 'Truck' or 'Bus'");
                    }
                    break;
                default:
                    break;
            }
        }

        Stream<String> res = result.build();
        List<String> list = res.collect(Collectors.toList());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if(list.get(i) == " km" || list.get(i).equals("Car needs refueling") ||
                    list.get(i).equals("Fuel must be a positive number")
                    || list.get(i).equals("Truck needs refueling")
                    || list.get(i).equals("Cannot fit fuel in tank")
                    || list.get(i).equals("Bus needs refueling")){
                System.out.println();
            }
        }
        System.out.printf("Car: %.2f", car.getFuelQuantity());
        System.out.println();
        System.out.printf("Truck: %.2f", truck.getFuelQuantity());
        System.out.println();
        System.out.printf("Bus: %.2f", bus.getFuelQuantity());
    }
}
