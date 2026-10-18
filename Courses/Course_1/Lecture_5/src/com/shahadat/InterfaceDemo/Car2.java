package com.shahadat.InterfaceDemo;

public class Car2 implements Engine, Brake, Media{
    @Override
    public void brake() {
        System.out.println("I brake like a normal caR");
    }

    @Override
    public void start() {
        System.out.println("I start Engine like a normal caR");
    }

    @Override
    public void stop() {
        System.out.println("I stop Engine like a normal caR");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate Engine like a normal caR");
    }
}
