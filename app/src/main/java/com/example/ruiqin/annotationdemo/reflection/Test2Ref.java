package com.example.ruiqin.annotationdemo.reflection;

import com.example.ruiqin.annotationdemo.reflection.bean.Person;

import java.lang.reflect.Field;

/**
 * @version 1.0
 * @author：ruiqin.shen
 * @since：2018/2/26
 */

public class Test2Ref {
    public static void main(String[] args) {
        Person person = new Person("ruqin.shen", 25);

        Class<?> cls = null;

        try {
            cls = Class.forName("com.example.ruiqin.annotationdemo.reflection.bean.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Person person1;
        try {
            person1 = (Person) cls.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

//        String name = person.getClass().getName();
        Class<? extends Person> aClass = person.getClass();
        Field[] declaredFields = person.getClass().getDeclaredFields();

    }

    public void print(String content) {
        System.out.println(content);
    }
}
