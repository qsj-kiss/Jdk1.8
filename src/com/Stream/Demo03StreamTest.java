package com.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Qin
 * Stream流测试题：
 * 题目要求:第一个队伍只需要名字为三个字的学生,存到一个集合
 *        第一个队伍只要前2个,存到一个集合
 *        第二个队伍只需要名字为俩个字的学生,存到一个集合
 *        第二个队伍只需后2个,存到一个集合
 *        将队伍一和队伍二合并到一个集合
 *        根据姓名创建Person对象,存储到一个集合
 *        打印所有Person对象
 * @createDate 2021/4/12 0:53
 * @updateDate 2021/4/12 0:53
 */
public class Demo03StreamTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("张三丰");
        list.add("李四");
        list.add("张三海");
        list.add("王五");
        list.add("王五棒");

        List<String> list2 = new ArrayList<>();
        list2.add("赵六");
        list2.add("赵六一");
        list2.add("田七");
        list2.add("田七三");
        list2.add("何八");
        list2.add("何八四");

//        Stream<String> stream1 = list.stream().filter(i -> i.length() == 3).limit(2L);
//        Stream<String> stream2 = list2.stream().filter(i -> i.length() == 2).skip(1L);
//        Stream.concat(stream1,stream2).map(name->new Person(name)).forEach(name-> System.out.println(name));
        Stream.concat(
                list.stream()
                    .filter(i -> i.length() == 3)
                    .limit(2L),
                list2.stream()
                    .filter(i -> i.length() == 2)
                    .skip(1L)
                    )
                    .map(name->new Person(name))
                    .forEach(System.out::println);

    }

     private static class Person{
        private String name;

        public Person(String name){
            this.name=name;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
