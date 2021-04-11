package com.FunctionalInterface.demo02;

/**
 * @author Qin
 * @createDate 2021/4/11 19:01
 * @updateDate 2021/4/11 19:01
 */
public class Runnable01 {
    public static void startThread(Runnable runnable){
        new Thread(runnable).start();
    }

    public static void main(String[] args) {
        System.out.println(0x7fffffff>>31);
        System.out.println(0x80000000>>31);
        System.out.println(10>>3);
        System.out.println(0b100>>2);

//        startThread(()-> System.out.println(Thread.currentThread().getName()+"----线程已启动"));
//        startThread(()-> System.out.println(Thread.currentThread().getName()+"----线程已启动"));
    }
}
