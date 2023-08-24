package org.example;

import org.example.io.nio.Object1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ${USER}
 * @version 1.0
 * @description: TODO
 * @date ${DATE} ${TIME}
 */
public class Main {
    public static void main(String[] args) {

        Object1 o = new Object1();
        Object1 o2 = new Object1();
        Set<Object1> set = new HashSet<>();
        set.add(o);
        set.add(o2);
        System.out.println(set);

    }
}
