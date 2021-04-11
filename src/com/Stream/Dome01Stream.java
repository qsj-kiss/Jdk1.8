package com.Stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * Stream转换流对象操作各种集合
 * @author Qin
 * @createDate 2021/4/11 23:14
 * @updateDate 2021/4/11 23:14
 */
public class Dome01Stream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        Map<String,String> map = new HashMap<>();
        Set<String> set1 = map.keySet();
        Stream<String> stream3 = set1.stream();

        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();

        Set<Map.Entry<String, String>> set2 = map.entrySet();
        Stream<Map.Entry<String, String>> stream5 = set2.stream();

        Stream<Integer> stream6 = Stream.of(1, 2, 3, 4, 5, 6);

        Integer[] integers = {1,2,3,4,5,6};
        Stream<Integer> stream7 = Stream.of(integers);

        String[] strings = {"1","2","3","4","5","6"};
        Stream<String> stream8 = Stream.of(strings);
    }
}
