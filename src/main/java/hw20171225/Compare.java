/**
 * Project Name:dt59homework
 * File Name:Compare.java
 * Package Name:hw20171225
 * Date:2017年12月25日下午4:52:31
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171225;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月25日 下午4:52:31 <br/>
 * 
 * @author luojuan
 * @version
 * @see
 */
public class Compare {
    int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个值：");
        int a1 = sc.nextInt();
        System.out.println("请输入一个值：");
        int b1 = sc.nextInt();
        Compare com = new Compare();
        System.out.println(a1 + "和" + b1 + "相比，" + "最大数为： " + com.max(a1, b1));

    }

}
