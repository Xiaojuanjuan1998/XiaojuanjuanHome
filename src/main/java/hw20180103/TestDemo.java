/**
 * Project Name:dt59homework
 * File Name:TestDemo.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午2:41:34
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午2:41:34 <br/>
 * 
 * @author luojuan
 * @version
 * @see
 */

import org.apache.log4j.Logger;

public class TestDemo {

    private final static Logger logger = Logger.getLogger(TestDemo.class);

    public static void main(String[] args) {

        Eat eat = new Chinese();
        // System.out.println(eat.kind());
        logger.info(eat.kind());
        Eat eat2 = new American();
        logger.info(eat2.kind());
        // System.out.println(eat2.kind());

    }

}
