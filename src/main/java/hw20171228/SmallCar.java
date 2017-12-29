/**
 * Project Name:dt59homework
 * File Name:SmallCar.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午6:40:50
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午6:40:50 <br/>
 * 
 * @author Administrator
 * @version
 * @see
 */
public class SmallCar extends Car {

    private String name = "小汽车";

    private String price = "贵";

    public String shudu() {
        return "小汽车的速度很快！";
    }

    public void show() {
        System.out.println(this.name + "的价格" + this.price + "，它也有" + this.getWindow() + "个窗户");

    }

}
