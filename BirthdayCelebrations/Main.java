package edu.softuni.polymorphism.BirthdayCelebrations;

import java.util.*;

public class Main {
    private static final String TYPE_CITIZEN = "Citizen";
    private static final String TYPE_PET = "Pet";
    private static final String TYPE_ROBOT = "Robot";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String line = scanner.nextLine();
        int n = scanner.nextInt();

        Set<Citizen> citizens = new HashSet<>();
        Set<Rebel> rebels = new HashSet<>();

        String line = scanner.nextLine();

        for (int i = 0; i < n - 1; i++) {
            String[] text = line.split("\\s+");

            //Citizens
            if (text.length == 4) {
                String name = text[0];
                int age = Integer.parseInt(text[1]);
                String id = text[2];
                String birthDate = text[3];

                Citizen c = new Citizen(name, age, id, birthDate);
                citizens.add(c);
            } else if (text.length == 3){
                String name = text[0];
                int age = Integer.parseInt(text[1]);
                String group = text[3];

                Rebel r = new Rebel(name, age, group);
                rebels.add(r);
            }
            line = scanner.nextLine();
        }

        int total = 0;

        line = scanner.nextLine();

        while (line.equals("End")) {
            String name = line;

            for (Citizen c: citizens) {
                if(c.getName().equals(name)){
                    total = total + 10;
                }
            }
            for (Rebel r: rebels) {
                if(r.getName().equals(name)){
                    total += 5;
                }
            }
            line = scanner.nextLine();
        }
        System.out.println(total);
/*        Map<String, Citizen> people = new HashMap<>();
        List<Pet> pets = new ArrayList<>();


        while(!line.equals("End")){
            String[] txt = line.split("\\s+");
            String type = txt[0];

            switch (type){
                case TYPE_CITIZEN:
                    String name = txt[1];
                    int age = Integer.parseInt(txt[2]);
                    String id = txt[3];
                    String birthday = txt[4];

                    Citizen citizen = new Citizen(name, age, id, birthday);
                    people.add(citizen);
                    break;
                case TYPE_PET:
                    String namePet = txt[1];
                    String birthdayPet = txt[2];

                    Pet pet = new Pet(namePet, birthdayPet);
                    pets.add(pet);
                    break;
            }
            line = scanner.nextLine();
        }
        String year = scanner.nextLine();

        for (Citizen c: people) {
            c.setYear(year);
            c.birthdaysCelebrate();
        }
        for (Pet p: pets) {
            p.setYear(year);
            p.birthdaysCelebrate();
        }
    }*/
    }
}
