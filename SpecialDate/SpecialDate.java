package edu.fmi;

public class SpecialDate {
    private int day;
    private int month;
    private int year;

    public SpecialDate(int day, int month, int year) {
        if (isValidDate(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
        else
        {
            this.day = 1;
            this.month = 1;
            this.year = 1900;
        }
    }

    public SpecialDate() {
        this(1,1,1900);
    }

    public SpecialDate(SpecialDate sd) {
        this(sd.day,sd.month,sd.year);
    }

    public static boolean isValidMonth(int month) {
        return (month >= 1) && (month <= 12);
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
    public static boolean isValidDate(int day, int month, int year){
        if (!isValidMonth(month))
            return false;

        int monthEnd = 30;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                monthEnd++;
                break;
            case 2:
                if (isLeapYear(year))
                    monthEnd--;
                else
                    monthEnd -= 2;
        }
        return (day >= 1) && (day <= monthEnd);
    }
	
    @Override
    public String toString() {
        return String.format("%02d.%02d.%d", day,month,year);
    }

}
