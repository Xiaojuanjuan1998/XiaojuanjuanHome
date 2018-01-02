/**
 * Project Name:dt59homework
 * File Name:Undergraduate.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午4:38:59
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午4:38:59 <br/>
 * 
 * @author luojuan
 * @version
 * @see
 */
public class Undergraduate extends Student {

    public Undergraduate(String IdCard, String name) { // 构造方法
        super(IdCard, name);
    }

    // 重写父类的print()方法
    @Override
    public void print() {
        super.print();// 调用父类的super方法
        System.out.println("我是学号为" + super.getIdCard() + "的学生");
    }

    public void timeUnd() {
        System.out.println("本科生" + super.getName() + "学时四年");
    }

    @Override
    public void Study(String IdCard, String name) {
    }

}
