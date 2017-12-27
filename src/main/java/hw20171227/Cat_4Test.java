/**
 * Project Name:dt59homework
 * File Name:Cat_4Test.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午6:40:09
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午6:40:09 <br/>
 * 
 * @author Administrator
 * @version
 * @see
 */
public class Cat_4Test {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.name = "小花";
        cat.age = 12;
        cat.hobby = "睡觉";
        cat.sex = '母';
        System.out.println(cat.name + " " + cat.age + " " + cat.hobby + " " + cat.sex);

        Cat cat1 = new Cat("小明");
        System.out.println(cat1.name);

        Cat cat2 = new Cat("小华", 15);
        System.out.println(cat2.name + cat2.age);

    }

}
