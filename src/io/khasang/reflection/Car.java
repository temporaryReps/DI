package io.khasang.reflection;

import io.khasang.reflection.di.Auto;

public class Car {
//    @Auto
    private Engine engine;
//    @Auto
    private Gear gear;

    private Owner owner;

    public Car() {
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Gear getGear() {
        return gear;
    }

    public void setGear(Gear gear) {
        this.gear = gear;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", gear=" + gear +
                ", owner=" + owner +
                '}';
    }
}
