/**
 * Project Name:dt59homework
 * File Name:OutDemo.java
 * Package Name:hw20180107
 * Date:2018年1月7日上午10:51:06
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */
/**
 * Project Name:dt59homework
 * File Name:OutDemo.java
 * Package Name:hw20180107
 * Date:2018年1月7日上午10:51:06
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180107;

import java.io.File;
import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月7日 上午10:51:06 <br/>
 * @author   luojuan
 * @version
 * @see
 */
/**
 * Description: <br/>
 * date: 2018年1月7日 上午10:51:06 <br/>
 *
 * @author LuoJuan
 * @version
 */
public class OutDemo {

    private final static Logger Log = Logger.getLogger(OutDemo.class);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想查询的路径：");
        String path = sc.next();
        printFile(new File(path));

    }

    public static void printFile(File file) {

        if (file.exists()) { // 判断文件或目录是否存在
            if (file.isFile()) {// 判断是否是文件
                Log.info("您给定的是一个文件");
            } else { // 路径名是目录
                File[] fileLists = file.listFiles(); // 获取该目录下的内容集合
                for (int i = 0; i < fileLists.length; i++) {// 循环遍历这个集合内容
                    Log.info(fileLists[i].getName());// 输出元素
                    if (fileLists[i].isDirectory()) {// 判断元素是不是一个目录
                        printFile(fileLists[i]);// 若为子目录，继续调用该方法输出其子目录
                    }
                }
            }
        } else {
            Log.info("文件名输入有误，请重新确认");

        }

    }
}
