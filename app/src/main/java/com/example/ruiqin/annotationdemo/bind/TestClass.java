package com.example.ruiqin.annotationdemo.bind;

import com.example.ruiqin.annotationdemo.test.BindPort;

/**
 * @version 1.0
 * @author：ruiqin.shen
 * @since：2018/2/26
 */

public class TestClass {
    @BindAddress()
    String address;
    @BindPort()
    private String port;

    private int number;

    public static void main(String[] args) {

    }

    public void printInfo() {
        System.out.println("info is " + address + ":" + port);
    }

}
