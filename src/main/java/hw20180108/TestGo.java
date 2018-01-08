package hw20180108;
/**
 * Project Name:Lesson7
 * File Name:Go2.java
 * Package Name:
 * Date:2018年1月8日上午11:01:14
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

/**
 * Description: <br/>
 * Date: 2018年1月8日 上午11:01:14 <br/>
 * 
 * @author luojuan
 * @version
 * @see
 */
public class TestGo {

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Go p = new Go(i);
            new Thread(p).start();
            // st3.setPriority(Thread.MAX_PRIORITY);

        }
    }
}
