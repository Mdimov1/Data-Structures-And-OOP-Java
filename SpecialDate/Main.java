package edu.fmi;

public class Main {

    public static void main(String[] args) {
	    SpecialDate date1 = new SpecialDate();
        System.out.println(date1);

        SpecialDate date2 = new SpecialDate(7,7,2012);
        System.out.println(date2);

        SpecialDate date3 = new SpecialDate(date2);
        System.out.println(date3);

        //System.out.println(SpecialDate.isValidMonth(int month));
        //System.out.println("Leap? "+ SpecialDate.isLeapYear(1990));
        System.out.println(SpecialDate.isValidDate(29,2,2000));
    }
}
