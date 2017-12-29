/**
 * Project Name:dt59homework
 * File Name:Train.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午6:51:11
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午6:51:11 <br/>
 * 
 * @author Administrator
 * @version
 * @see
 */
public class Train extends Vehicle {

    @Override
    public void run() {

        // Auto-generated method stub
        System.out.println("火车能跑");

    } // 火车类

    public static void main(String[] args) {
        System.out.println("*************第4题**********");
        Train tr = new Train();
        tr.run();
    }
}
