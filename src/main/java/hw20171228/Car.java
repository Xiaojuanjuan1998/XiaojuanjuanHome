/**
 * Project Name:dt59homework
 * File Name:Car.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午6:39:03
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午6:39:03 <br/>
 * 
 * @author Administrator
 * @version
 * @see
 */
public abstract class Car {

    private int window;

    private String mark;

    public int getWindow() {
        return window;
    }

    public void setWindow(int window) {
        this.window = window;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void summary() { // 车的简介
        window = 4;
        mark = "奥迪";
        System.out.println("这是一辆有" + window + "个窗户的车，是" + mark + "的！");
    }

    void stop() {
        System.out.println("能跑");
    }

    // abstract void run();抽象方法在抽象类中只能声明，不能具体实现

    // void what(String flag) {
    // System.out.println("this is");
    // }

}
