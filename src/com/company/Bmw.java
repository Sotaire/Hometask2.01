package com.company;

public class Bmw extends Car {

    private int mileage;

    public Bmw(int year, TypeOfTransport typeOfTransport, Color color, String model, int maxSpeed,int mileage) {
        super(year, typeOfTransport, color, model, maxSpeed);
        this.mileage = mileage;
    }

    public int getMileage () {
        return mileage;
    }

    public void Copyrighting(Bmw bmw){
        this.mileage = bmw.mileage;
    }

    @Override
    public void setAction(String action,int speed){
        super.setAction(action,speed);
    }

}
