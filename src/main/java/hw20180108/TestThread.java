package hw20180108;
/**
 * Project Name:Lesson2
 * File Name:TestThread.java
 * Package Name:Lesson20180108
 * Date:2018年1月8日上午10:22:11
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

/**
 * Description: <br/>
 * Date: 2018年1月8日 上午10:22:11 <br/>
 * 
 * @author luojuan
 * @version
 * @see
 */
public class TestThread {

    public static void main(String[] args) {

        ThreadDemo st1 = new ThreadDemo("小花");
        ThreadDemo st2 = new ThreadDemo("小明");
        ThreadDemo st3 = new ThreadDemo("小南");
        ThreadDemo st4 = new ThreadDemo("张三");
        ThreadDemo st5 = new ThreadDemo("李四");
        ThreadDemo st6 = new ThreadDemo("王五");
        st1.setName("a");
        st2.setName("b");
        st3.setName("c");
        st4.setName("d");
        st5.setName("e");
        st6.setName("f");
        st1.start();
        st2.start();
        st3.start();
        st4.start();
        st5.start();
        st6.start();

        st3.setPriority(Thread.MAX_PRIORITY);

        st1.setPriority(Thread.MIN_PRIORITY);

    }

}
