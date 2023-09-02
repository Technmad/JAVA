package com.oop.abstraction;
// using abstraction class
// abstraction method
// constructor

abstract class bikeInfo{
    bikeInfo(){
        System.out.println("Bike is created");
    }
    abstract void run();
    void changeGear(){
        System.out.println("Gear is changed");
    }
}
class bajaj extends bikeInfo{
    void run() {
        System.out.println("running safely");
    }
}

public class Bike {
    public static void main(String[] args) {
       bikeInfo bike1=new bajaj();
       bike1.run();
       bike1.changeGear();
    }
}

