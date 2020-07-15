package com.company;

public class Car extends Transport {

    private String model;
    private int maxSpeed;

    public Car(int year, TypeOfTransport typeOfTransport, Color color,String model,int maxSpeed) {
        super(year, typeOfTransport, color);
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public String getModel () {
        return model;
    }

    public int getMaxSpeed (){
        return maxSpeed;
    }

    public void setAction (String action, int speed) {
        System.out.println(action + " до " + speed);
    }

    public final void setAction (String action) {
        System.out.println(action);
    }

}
