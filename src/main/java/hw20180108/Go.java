package hw20180108;
/**
 * Project Name:Lesson7
 * File Name:Go1.java
 * Package Name:
 * Date:2018年1月8日上午11:00:59
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

/**
 * Description: <br/>
 * Date: 2018年1月8日 上午11:00:59 <br/>
 * 
 * @author luojuan
 * @version
 * @see
 */

public class Go implements Runnable {

    int i;

    Go(int i) {
        this.i = i;
    }

    @Override
    public void run() {

        System.out.println("//////" + i);

    }
}
