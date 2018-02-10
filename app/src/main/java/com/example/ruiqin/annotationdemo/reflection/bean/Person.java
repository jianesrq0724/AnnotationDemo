package com.example.ruiqin.annotationdemo.reflection.bean;

/**
 * 功能：
 * 创建者：ruiqin.shen
 * 创建日期：2018/2/10
 * 版权所有：深圳市亿车科技有限公司
 */

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
