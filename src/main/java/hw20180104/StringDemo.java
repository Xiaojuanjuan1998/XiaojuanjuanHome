/**
 * Project Name:dt59homework
 * File Name:StringDemo.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午2:15:01
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午2:15:01 <br/>
 * 
 * @author luojuan
 * @version
 * @see
 */
public class StringDemo {

    private final static Logger Log = Logger.getLogger(StringDemo.class);

    public static void main(String[] args) {

        String str = "o u r ";
        char s = str.charAt(0); // charAt()取出指定位置的字符
        Log.info(s);

        String s1 = str.concat("your");// concat()在原字符串后面增加指定的字符串
        Log.info(s1);

        Log.info(s1.contains("o u r"));// contains()比较原字符中是否包含指定的字符串

        char[] data = { '1', '2', '3' };
        String s3 = str.copyValueOf(data);// copyValueOf()将字符数组转变为字符串
        Log.info(s3);

        boolean s4 = s1.endsWith("r");// endsWith()是否以指定的字符串结尾
        Log.info(s4);

        if (str.equals("our")) { // equals()判断原字符串是否为指定的字符串
            Log.info("true");
        } else {
            Log.info("false");
        }

        Log.info(str.equalsIgnoreCase("O U r ")); // equalsIgnoreCase()判断原字符串是否为指定的字符串,大小写均可

        // Log.info(str.format("123", s1));

        Log.info(str.indexOf("u"));// 指定字符出现的第一次索引

        Log.info(str.isEmpty()); // 是否为空
    }
}
