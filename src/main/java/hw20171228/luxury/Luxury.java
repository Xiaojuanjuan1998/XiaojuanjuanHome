/**
 * Project Name:dt59homework
 * File Name:Luxury.java
 * Package Name:hw20171228.luxury
 * Date:2017年12月29日下午6:58:05
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228.luxury;

import hw20171228.Car;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午6:58:05 <br/>
 * 
 * @author Administrator
 * @version
 * @see
 */

public class Luxury extends Car {
    @Override
    public void summary() {
        this.setWindow(2);
        this.setMark("玛莎拉蒂");
        System.out.println("我是豪车，只有" + this.getWindow() + "个窗户，叫" + this.getMark());
    }
}
