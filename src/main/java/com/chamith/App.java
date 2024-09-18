package com.chamith;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // To configure using xml file
        Alien obj1 = context.getBean("alien", Alien.class);
//        obj1.setAge(21);
        System.out.println(obj1.getAge());
        obj1.code();
//
//        Alien obj2 = (Alien) context.getBean("alien1");
//        System.out.println(obj2.age);
//        obj2.code();
    }
}
