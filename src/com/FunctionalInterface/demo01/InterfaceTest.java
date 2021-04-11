package com.FunctionalInterface.demo01;

/**
 * 测试函数式接口
 * @author Qin
 * @createDate 2021/4/11 18:35
 * @updateDate 2021/4/11 18:35
 */
public class InterfaceTest {
    public static void main(String[] args) {
        show(()->"123");
    }

    public static void show(Interface msg){
        System.out.println(msg.Message());
    }
}
