package edu.softuni;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	Map<Integer, BankAccount> accounts = new HashMap<>();
	String line = "";

	while (!line.equals("End")){

	    line = scanner.nextLine();
        String[] text = line.split(" ");

	    switch(text[0]){
            case "Create":
                BankAccount acc = new BankAccount();
                accounts.put(acc.getId(), acc);
                System.out.println("Account ID" + acc.getId() + " created");
                break;
            case "Deposit":
                int id = Integer.valueOf(text[1]);
                double amount = Double.valueOf(text[2]);

                try {
                    accounts.get(id).deposit(amount);
                    System.out.printf("Deposited %.0f to ID%d%n", amount, id);
                } catch (Exception e){
                    System.out.println("Account does not exist");
                }
                break;
            case "SetInterest":
                BankAccount.setInterest(Double.parseDouble((text[1])));
                break;
            case "GetInterest":
                try {
                    System.out.printf("%.2f", accounts
                            .get(Integer.parseInt(text[1]))
                            .getInterestRate(Integer.parseInt(text[2])));
                } catch (Exception e){
                    System.out.println("Account does not exist");
                }
                break;
        }
    }
    }
}
