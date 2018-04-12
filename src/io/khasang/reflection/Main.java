package io.khasang.reflection;

import io.khasang.reflection.di.Context;

public class Main {
    public static void main(String[] args) {
//        Context<Car> context = new Context<>("config.xml"); //first task
//        Context<Car> context = new Context<>("random_config.xml"); //second task without annotation
        Context<Car> context = new Context<>("random_config_annotation.xml"); // second task with annotation
        Car car = context.getBean("car"); // DZ generics

        System.out.println(car);
    }
}
