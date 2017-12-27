/**
 * Project Name:dt59homework
 * File Name:Cup_5Test.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午6:43:49
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午6:43:49 <br/>
 * 
 * @author Administrator
 * @version
 * @see
 */
public class Cup_5Test {

    public static void main(String[] args) {

        Cup cup = new Cup();

        cup.setSize(12);
        cup.setName("水杯");
        cup.setColor("红色");
        System.out.println("这是一个大小为：" + cup.getSize() + "的" + cup.getName() + "是" + cup.getColor());

    }

}
