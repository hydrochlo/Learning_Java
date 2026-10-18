package com.shahadat.InterfaceDemo;

public class Main {
    static void main(String[] args) {
        Car car = new Car();

        car.acc();
        car.start();
        car.stop();

        Engine car2 = new Car();
//        car2.a; // You cannot access this.
                // Because: What things you access depends on `Engine` and
                // which one of those versions to access depends on `Car()`.

        System.out.println("\n-----------------\n");
        Media carMedia = new Car2();
        carMedia.start();
        carMedia.stop();

        System.out.println("\n-----------------\n");
        Car2 car3 = new Car2();
        car3.acc();
        car3.start();
        car3.stop();
        car3.brake();
        System.out.println("\n-----------------\n");

        NiceCar car4 = new NiceCar();
        car4.start();
        car4.startMusic();
        System.out.println("\n-----------------\n");
        car4.upgradeEngine();
        car4.start();
        car4.startMusic();
    }
}
