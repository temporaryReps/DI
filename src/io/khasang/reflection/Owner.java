package io.khasang.reflection;

public class Owner {
    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "car=" + car +
                '}';
    }
}
