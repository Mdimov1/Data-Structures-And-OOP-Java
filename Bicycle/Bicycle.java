package edu.fmi;

public class Bicycle {
    private double frame;
    private int gear;
    private int speed;

    public Bicycle(double frame,int gear,int speed) {
        if ((frame>0)&&(gear>0)&&(speed>0)) {
            this.frame = frame;
            this.gear = gear;
            this.speed = speed;
        }
        else {
            this.frame = 0;
            this.gear = 0;
            this.speed = 0;
        }
    }
    public Bicycle() {
        this(0,0,0);
    }
    public Bicycle(Bicycle b) {
        this(b.frame,b.gear,b.speed);
    }

    public double getFrame() {
        return frame;
    }

    public void setFrame(double frame) {
        if (frame > 0) {
            this.frame = frame;
        }
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        if (gear > 0) {
            this.gear = gear;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        }
    }
    public int incSpeed() {
        return speed++;
    }
    public int decSpeed() {
        return speed--;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "frame=" + frame +
                ", gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}
