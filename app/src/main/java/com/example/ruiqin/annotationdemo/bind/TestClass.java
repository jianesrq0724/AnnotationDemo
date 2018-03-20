package com.example.ruiqin.annotationdemo.bind;

import com.ruiqin.annotation.test.BindPort;
import com.ruiqin.annotation.test.BindAddress;

/**
 * @version 1.0
 * @author：ruiqin.shen
 * @since：2018/2/26
 */

public class TestClass {
    @BindAddress()
    static String address;
    @BindPort()
    private static String port;

    private int number;

    public static void main(String[] args) {
        printInfo();
    }

    public static void printInfo() {
        System.out.println("info is " + address + ":" + port);
    }

}
