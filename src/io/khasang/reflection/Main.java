package io.khasang.reflection;

import io.khasang.reflection.di.Context;

public class Main {
    public static void main(String[] args) {
//        Context context = new Context("config.xml"); //first task
//        Context context = new Context("random_config.xml"); //second task without annotation
//        Context context = new Context("random_config_annotation.xml"); // second task with annotation
        Context context = new Context("third_task_config.xml"); // third task
        Car car = context.getBean("car"); // DZ generics

        System.out.println(car);
    }
}
