/**
 * Project Name:dt59homework
 * File Name:CopyDemo.java
 * Package Name:hw20180107
 * Date:2018年1月7日下午1:56:09
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180107;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午1:56:09 <br/>
 * 
 * @author luojuan
 * @version
 * @see
 */
public class CopyDemo {

    private final static Logger Log = Logger.getLogger(CopyDemo.class);

    public static void copyFile(File oldfile, File newfile) throws IOException {

        FileInputStream ins = new FileInputStream(oldfile);// 原路径名
        FileOutputStream out = new FileOutputStream(newfile);// 复制地址文件名
        byte[] b = new byte[1024];// 创建一个空间为1024个字节的数组b
        int len = ins.read(b);// 从原文件中读取b个字节给len
        while (len != -1) {// read()方法的返回值为-1，文件读完
            out.write(b, 0, b.length);// 将b数组中的第一个字符开始到最后一个写入该文件
            len = ins.read(b);
        }
        ins.close();
        out.close();
        Log.info("文件已转移");
    }

    public static void main(String[] args) throws IOException {
        File oldf = new File("D:\\myDoc\\hello1.txt");
        File newf = new File("D:\\myDoc\\text.txt");
        copyFile(oldf, newf);
    }

}
