package com.Stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * Stream常用方法
 * 延迟方法：filter,limit,map,skip,concat
 * 终结方法:count,forEach
 * Stream属于管道流只能被使用一次,如果再对调用过的流进行操作则会报流已经关闭了
 * @author Qin
 * @createDate 2021/4/11 23:14
 * @updateDate 2021/4/11 23:14
 */
public class Dome02Stream {
    public static void main(String[] args) {
//        forEach();
//        count();
//        filter();
//        map();
//        limit();
//        skip();
        concat();
    }

    /**
        * 遍历方法
        * @author Qin ShiJiao
        * @createTime 2021/4/12 0:43
    */
    public static void forEach(){
        String[] strings = {"张三","李四","王五","赵六","田七"};
        Stream.of(strings).forEach(name-> System.out.println(name));
    }

    /**
     * 统计方法
     * @author Qin ShiJiao
     * @createTime 2021/4/12 0:41
     */
    public static void count(){
        String[] strings = {"1","2","3","4","5","6","7"};
        long count = Stream.of(strings).count();
        System.out.println(count);
    }

    /**
        * 过滤方法
        * @author Qin ShiJiao
        * @createTime 2021/4/12 0:42
    */
    public static void filter(){
        String[] strings = {"张三","李四","王五","赵六","张七"};
//        Stream.of(strings).filter(name->!name.equals("张三")).forEach(name-> System.out.println(name));
        //过滤出第一个字符为张的数据
        Stream.of(strings).filter(name->name.startsWith("张")).forEach(name-> System.out.println(name));
    }

    /**
        * 映射方法
        * @author Qin ShiJiao
        * @createTime 2021/4/12 0:42
    */
    public static void map(){
        String[] strings = {"1","2","3","4","5","6","7"};
        Stream.of(strings).map(i -> Integer.parseInt(i)).forEach(i-> System.out.println(i));
    }

    /**
        * 截取方法
        * @author Qin ShiJiao
        * @createTime 2021/4/12 0:41
    */
    public static void limit(){
        String[] strings = {"张三","李四","王五","赵六","田七"};
        //截取前四个数据
       Stream.of(strings).limit(4l).forEach(i-> System.out.println(i));
    }

    /**
        * 跳过方法
        * @author Qin ShiJiao
        * @createTime 2021/4/12 0:48
    */
    public static void skip(){
        String[] strings ={"张三","李四","王五","赵六"};
        //跳过前一个数据
        Stream.of(strings).skip(1L).forEach(i-> System.out.println(i));
    }

    /**
     * 组合流,合并流
     * @author Qin ShiJiao
     * @createTime 2021/4/12 0:48
     */
    public static void concat(){
        String[] strings1 ={"张三","李四","王五","赵六"};
        String[] strings2 ={"田七","刘八","成九","何十"};
        Stream.concat(Stream.of(strings1),Stream.of(strings2)).forEach(i-> System.out.println(i));
    }
}
