package com.utm;

public class Car extends Vehicle{
    private String mark = new String("Toyota");

    public void Car(String mark) {
        this.mark.equals(mark);
        System.out.println("Car constructor: " + price + this.mark);
    }

    public String showMark() {                 //outputs the car mark
        System.out.println("Car show mark: " + price + mark);
        return mark;
    }
}
