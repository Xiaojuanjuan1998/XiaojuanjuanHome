/**
 * Project Name:dt59homework
 * File Name:VipCard.java
 * Package Name:hw20171225
 * Date:2017年12月25日下午5:30:07
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171225;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月25日 下午5:30:07 <br/>
 * 
 * @author luojuan
 * @version
 * @see
 */
public class VipCard {

    double vip(double yuan, int jibie) {

        double sum = 0;
        switch (jibie) {
        case 1:
            sum = yuan * 0.75;
            break;
        case 2:
            sum = yuan * 0.8;
            break;

        case 3:
            sum = yuan * 0.85;
            break;
        case 4:
            sum = yuan * 0.9;
            break;

        case 5:
            sum = yuan * 0.95;
            break;
        default:
            return sum;
        }
        return sum;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入您的会员等级：\n1.至尊级\n2.钻石级\n3.铂金级\n4.黄金级\n5.白银级");
        int num = input.nextInt();
        System.out.println("请输入您的金额");
        double yuan = input.nextDouble();
        VipCard vip = new VipCard();
        System.out.println("您的消费金额为：" + vip.vip(yuan, num));
    }

}
