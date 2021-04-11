package com.ObjectMethodReference;

import com.MethodReference.Printable;

/**
 * @author Qin
 * 通过对象名引用成员方法
 * 使用前提是对象是已经存在的,成员方法也是已经存在的
 * 就可以使用对象名来引用成员方法
 * @createDate 2021/4/12 1:29
 * @updateDate 2021/4/12 1:29
 */
public class Demo1ObjectPrintable {
    public static void print(Printable p){
        p.show("abcdefg");
    }

    public static void main(String[] args) {
        //lambda写法
        print(s->{
            //创建对象
            MethodObject methodObject = new MethodObject();
            //调用方法
            methodObject.printUpperCaseString(s);
        });
        //方法引用写法
        //注意事项:对象存在,成员方法存在,转换类型正确
        print(new MethodObject()::printUpperCaseString);

    }
}
