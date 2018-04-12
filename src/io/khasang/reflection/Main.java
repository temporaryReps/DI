package io.khasang.reflection;

import io.khasang.reflection.di.Context;

public class Main {
    public static void main(String[] args) {
//        Context<Car> context = new Context<>("config.xml");
        Context<Car> context = new Context<>("random_config.xml");
        Car car = context.getBean("car"); // DZ generics

        System.out.println(car);
    }
}
