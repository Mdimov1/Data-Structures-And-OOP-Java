package edu.fmi;

public class MtnBike extends Bicycle{
    private int suspension;
    private int tyresWidth;

    public MtnBike(double frame, int gear, int speed, int suspension,int tyresWidth) {
        super(frame, gear, speed);
        this.suspension = suspension;
        this.tyresWidth = tyresWidth;
    }

    public MtnBike() {
        super(0,0,0);
        this.suspension = 0;
        this.tyresWidth = 0;
    }

    public MtnBike(Bicycle b, MtnBike c) {
        super(b);
        this.suspension = c.suspension;
        this.tyresWidth = c.tyresWidth;
    }

    public int getSuspension() {
        return suspension;
    }

    public void setSuspension(int suspension) {
        if (suspension>0)
        this.suspension = suspension;
    }

    public int getTyresWidth() {
        return tyresWidth;
    }

    public void setTyresWidth(int tyresWidth) {
        if (tyresWidth>0)
        this.tyresWidth = tyresWidth;
    }

    @Override
    public String toString() {
        return super.toString()+"MtnBike{" +
                "suspension=" + suspension +
                ", tyresWidth=" + tyresWidth +
                '}';
    }


}
