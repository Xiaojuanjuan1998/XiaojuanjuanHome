/**
 * Project Name:dt59homework
 * File Name:Dog6_Test.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午6:48:35
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午6:48:35 <br/>
 * 
 * @author Administrator
 * @version
 * @see
 */
public class Dog6_Test {

    public static void main(String[] args) {

        Dog dog = new Dog();
        System.out.println("这是一个年龄为：" + dog.age + "性别为：" + dog.sex + "一天吃" + dog.eat() + "顿，兴趣是" + dog.hobby());
        System.out.println(Dog.age);

        System.out.println(Dog.eat());
        /*
         * 加入了static以后，方法和属性都是共享的，类和对象都可以调用 不加static，方法和属性只能被对象调用
         */

    }

}
