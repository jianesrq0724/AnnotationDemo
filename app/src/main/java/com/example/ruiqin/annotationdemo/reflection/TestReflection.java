package com.example.ruiqin.annotationdemo.reflection;

import com.example.ruiqin.annotationdemo.reflection.bean.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 功能：
 * 创建者：ruiqin.shen
 * 创建日期：2018/2/10
 * 版权所有：深圳市亿车科技有限公司
 */

public class TestReflection {
    public static void main(String[] args) {
        Person person = new Person("ruiqin", 24);


//        Class<? extends Person> aClass = person.getClass();

        Class<?> aClass = null;
        try {
            aClass = Class.forName("com.example.ruiqin.annotationdemo.reflection.bean.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Field[] declaredFields = aClass.getDeclaredFields();


        String name = aClass.getName();

        Method[] methods = aClass.getMethods();



//        Class<Person> personClass = Person.class;


    }
}
