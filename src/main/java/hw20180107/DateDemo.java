/**
 * Project Name:dt59homework
 * File Name:DateDemo.java
 * Package Name:hw20180107
 * Date:2018年1月7日下午3:02:18
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180107;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午3:02:18 <br/>
 * 
 * @author luojuan
 * @version
 * @see
 */
public class DateDemo {

    private final static Logger Log = Logger.getLogger(DateDemo.class);

    public static void main(String[] args) {
        Date date = new Date();
        Log.info("当前时间是：" + date);

        Date date1 = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 a HH:mm:ss.SSSZ");
        String strDate1 = sdf1.format(date1);
        Log.info("当前时间是：" + strDate1);

        Date date2 = new Date();
        SimpleDateFormat sdf2 = new SimpleDateFormat("Gyyyy年,今天是一年中的第w周第D天，本月的第W周第d天E");
        String strDate2 = sdf2.format(date2);
        Log.info("当前时间是：" + strDate2);

        Date date3 = new Date();
        SimpleDateFormat sdf3 = new SimpleDateFormat("今天的第k小时是a的第K小时");
        String strDate3 = sdf3.format(date3);
        Log.info("当前时间是：" + strDate3);
    }

}
