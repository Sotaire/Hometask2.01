package com.company;

public class Transport {

    private int year;
    private  TypeOfTransport typeOfTransport;
    private Color color;

    public Transport (int year, TypeOfTransport typeOfTransport, Color color) {
        this.year = year;
        this.typeOfTransport = typeOfTransport;
        this.color = color;
    }



    public int getYear () {return year;}

    public TypeOfTransport getTypeOfTransport () {return typeOfTransport;}

    public Color getColor () {return color;}

}
