package com.MethodReference;

/**
 * @author Qin
 * @createDate 2021/4/12 1:15
 * @updateDate 2021/4/12 1:15
 */
public class Demo1Printable {
    public static void print(Printable p){
        p.show("我是打印的数据");
    }

    public static void main(String[] args) {
        //调用打印方法
        print(name-> System.out.println(name));
        /**
         * 分析:
         *      lambda表达式的目的,打印参数传递的字符串
         *      把参数name传入,调用show方法的方法对字符串进行输出
         *      我们可以使用方法引用来优化lambda表达式
         *      可以使用System.out方法直接调用print方法
         */
        print(System.out::println);
    }
}
