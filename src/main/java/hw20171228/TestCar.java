/**
 * Project Name:dt59homework
 * File Name:TestCar.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午6:47:16
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;

import hw20171228.luxury.Luxury;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午6:47:16 <br/>
 * 
 * @author Administrator
 * @version
 * @see
 */
public class TestCar {

    public static void main(String[] args) {

        System.out.println("**********第1题**********");
        // Car car=new car();
        // 错误，抽象类不能实例化
        // 只能用子类进行化
        SmallCar smallCar = new SmallCar();
        smallCar.shudu();
        smallCar.summary();

        Car bigCar = new BigCar();
        // bigCar.run();
        System.out.println();

        System.out.println("**********第2题**********");
        smallCar.show();
        System.out.println();

        System.out.println("**********第3题**********");
        Luxury lu = new Luxury();
        lu.summary();

    }

}
