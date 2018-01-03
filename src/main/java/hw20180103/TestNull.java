/**
 * Project Name:dt59homework
 * File Name:TestNull.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午2:53:51
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午2:53:51 <br/>
 * 
 * @author luojuan
 * @version
 * @see
 */
/**
 * 空指针异常的原因 1、字符串变量未初始化 2、接口类型的对象没有用具体的类初始化
 * 
 * Description: <br/>
 * date: 2018年1月3日 下午4:41:16 <br/>
 *
 * @author LuoJuan
 * @version
 */
public class TestNull {
    private final static Logger logger = Logger.getLogger(TestDemo.class);

    public static void main(String[] args) {

        String str = null;
        try {
            if (str.equals("Test")) {

            }
        } catch (NullPointerException e) {
            // System.out.println("空指针异常");
            logger.info("str=" + str + ",空指针异常");
        }

    }

}
