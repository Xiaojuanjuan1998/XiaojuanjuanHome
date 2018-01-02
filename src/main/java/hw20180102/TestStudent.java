/**
 * Project Name:dt59homework
 * File Name:TestStudent.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午4:43:50
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午4:43:50 <br/>
 * 
 * @author luojuan
 * @version
 * @see
 */
public class TestStudent {

    public static void main(String[] args) {

        // 父类引用指向子类对象，调用方法时会调用子类的实现，而不是父类的实现，这叫多态
        // Teacher tea = new Teacher("张老师");
        Student stu = new Undergraduate("0202", "小花");
        stu.teacher("张老师", stu); // 老师教学生学习 张老师教一年级的小花学习
        stu.print();

        System.out.println("*************************");
        Student gra = new Graduate("1234", "小明");
        gra.teacher("王老师", gra);
    }

}
