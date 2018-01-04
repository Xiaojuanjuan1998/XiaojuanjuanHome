/**
 * Project Name:dt59homework
 * File Name:ListDemo.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午3:43:35
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午3:43:35 <br/>
 * 
 * @author luojuan
 * @version
 * @see
 */
public class ListDemo {

    private final static Logger Log = Logger.getLogger(ListDemo.class);

    public static void main(String[] args) {

        Log.info("*************添加元素*************");
        List list = new ArrayList();
        /**
         * 增加元素
         */
        list.add(1); // add()添加元素
        list.add("zxc");
        list.add(67);
        list.add("rty");
        Log.info(list);

        /**
         * 查询元素
         */
        Log.info("*************查询元素*************");
        Log.info(list.contains("asd")); // contains()判断原集合是否含有指定元素
        Log.info(list.containsAll(list)); // containsAll判断原集合是否含有指定集合

        List list2 = new ArrayList();
        list2.add("123");
        list2.add("qwe");
        Log.info(list.equals(list2));// equals判断原集合是否为指定集合

        /**
         * 修改元素
         */
        Log.info("*************修改元素*************");
        list.set(2, "xiao");// set指定一个位置把旧元素替换成新元素
        Log.info(list);

        /**
         * 插入元素
         */
        Log.info("*************插入元素*************");
        list.add(0, "asd"); // 在指定位置插入元素
        Log.info(list);
        list.addAll(list2);
        Log.info(list);

        /**
         * 遍历元素
         */
        Log.info("*************遍历元素*************");
        Object[] objs = list2.toArray();
        // for (int x = 0; x < objs.length; x++) {
        // Log.info("8." + objs[x]);
        // }

        Iterator it = list.iterator();
        while (it.hasNext()) {
            Log.info(it.next());
        }

        /**
         * 删除元素
         */
        Log.info("*************删除元素*************");
        list.remove("asd");// remove()移除指定位置的元素
        Log.info(list);
        list.remove(2);// remove()移除指定位置的元素
        Log.info(list);
        list.clear(); // clear()清除所有元素
        Log.info(list);
    }

}
