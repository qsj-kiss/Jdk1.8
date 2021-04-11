package com.MethodReference;

/**
 * @author Qin
 * 定义一个打印的函数接口
 * @createDate 2021/4/12 1:14
 * @updateDate 2021/4/12 1:14
 */
@FunctionalInterface
public interface Printable {
    //打印字符串的方法
    void show(String msg);
}
