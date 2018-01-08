package hw20180108;
/**
 * Project Name:Lesson2
 * File Name:ScannerThread.java
 * Package Name:Lesson20180108
 * Date:2018年1月8日上午10:15:41
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

/**
 * Description: <br/>
 * Date: 2018年1月8日 上午10:15:41 <br/>
 * 
 * @author luojuan
 * @version
 * @see
 */
public class ThreadDemo extends Thread {

    // private int i;

    private String name;

    @Override
    public void run() {

        System.out.println(getName() + "-----:" + name);

    }

    public ThreadDemo(String name) {
        this.name = name;
    }

}
