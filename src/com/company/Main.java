package com.company;

public class Main {

    public static void main(String[] args) {

        TypeOfTransport typeOfTransport1;
        Car car = new Car(2003,typeOfTransport1 = new TypeOfTransport("passenger"),Color.BLACK,"Mercedes",220);
        System.out.println("maxSpeed: " + car.getMaxSpeed() + "\n" + "model: " + car.getModel() + "\n" + "type: " + typeOfTransport1.getType() + "\n" + "color: " + car.getColor() + "\n" + "year: " + car.getYear());
        car.setAction("Stop");

        Bmw bmw1 = new Bmw(2000,typeOfTransport1 = new TypeOfTransport("passenger"),Color.BLUE,"X5",250,500);
        System.out.println("maxSpeed: " + bmw1.getMaxSpeed() + "\n" + "model: " + bmw1.getModel() + "\n" + "type: " +
                typeOfTransport1.getType() + "\n" + "color: " + bmw1.getColor() + "\n" + "year: " + bmw1.getYear() + "\n" + "mileage: " + bmw1.getMileage());

        Bmw bmw2 = new Bmw(2005,typeOfTransport1 = new TypeOfTransport("passenger"),Color.GRAY,"X6",300,200);
        System.out.println("maxSpeed: " + bmw2.getMaxSpeed() + "\n" + "model: " + bmw2.getModel() + "\n" + "type: " +
                typeOfTransport1.getType() + "\n" + "color: " + bmw2.getColor() + "\n" + "year: " + bmw2.getYear() + "\n" + "mileage: " + bmw2.getMileage());

        bmw2.Copyrighting(bmw1);
        System.out.println("maxSpeed: " + bmw2.getMaxSpeed() + "\n" + "model: " + bmw2.getModel() + "\n" + "type: " +
                typeOfTransport1.getType() + "\n" + "color: " + bmw2.getColor() + "\n" + "year: " + bmw2.getYear() + "\n" + "mileage: " + bmw2.getMileage());

    }
}
