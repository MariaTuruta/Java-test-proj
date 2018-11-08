package com.utm;

public class Vehicle {
    protected int price;

    public void Vehicle (int price){
        this.price = price;
        System.out.println("Vehicle constructor: " + this.price);
    }

    public void setPrice(int price){
        this.price = price;
        System.out.println("setprice: " + this.price);
    }

    public int getPrice() {
        System.out.println("getprice: " + this.price);
        return this.price;
    }

    public int doublePrice(){
        price = this.price * 2;
        System.out.println("doubleprice: " + price);
        return price;
    }
}