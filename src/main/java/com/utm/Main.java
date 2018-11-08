package com.utm;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Car();

        v.setPrice(10);               //sets price to 10
        v.getPrice();                 //gets the price
        v.doublePrice();

        Car c = new Car();
        c.showMark();
    }
}