package com.FunctionalInterface.demo02;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Qin
 * @createDate 2021/4/11 19:01
 * @updateDate 2021/4/11 19:01
 */
public class Comparator01 {
    public static Comparator<String> getComparator(){
        return  new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        };
    }

    public static void main(String[] args) {
        String[] strings = {"aaaa","bbbbb","cccccc","dd"};
        System.out.println(Arrays.toString(strings));
        Arrays.sort(strings,getComparator());
        System.out.println(Arrays.toString(strings));
    }
}
