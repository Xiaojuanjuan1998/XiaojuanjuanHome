/**
 * Project Name:dt59homework
 * File Name:MapDemo.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午5:15:48
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午5:15:48 <br/>
 * 
 * @author luojuan
 * @version
 * @see
 */
public class MapDemo {

    private final static Logger Log = Logger.getLogger(MapDemo.class);

    public static void main(String[] args) {

        Map map = new HashMap();
        Log.info("*************添加元素*************");
        map.put("CN", "中国");
        map.put("RU", "俄罗斯");
        map.put("FR", "faguo");
        map.put("US", "美国");
        map.put("oo", "fag");
        Log.info(map);

        Log.info("*************查询元素*************");
        String str = (String) map.get("CN");
        Log.info("CN对应的国家是：" + str);

        boolean result = map.containsKey("FU");
        Log.info("MAP中是否含有“FU”的键：" + result);
        boolean result2 = map.containsValue("法国");
        Log.info("MAP中是否含有“法国”的关键字：" + result2);

        Log.info("*************修改元素*************");
        map.put("FR", "法国");
        Log.info(map);
        Log.info("*************插入元素*************");

        Log.info("*************遍历元素*************");
        Set it = map.keySet();
        Iterator it2 = it.iterator();
        while (it2.hasNext()) {
            Log.info(it2.next());
        }

        Log.info("*************删除元素*************");
        map.remove("RU");
        Log.info(map);
    }

}
