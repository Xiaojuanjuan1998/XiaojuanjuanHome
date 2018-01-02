/**
 * Project Name:dt59homework
 * File Name:Student.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午4:34:36
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午4:34:36 <br/>
 * 
 * @author luojuan
 * @version
 * @see
 */
public abstract class Student {
    private String IdCard; // 学生的ID

    private String name; // 学生的名字

    public String getIdCard() {
        return IdCard;
    }

    public void setIdCard(String idCard) {
        IdCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void Study(String IdCard, String name);// 抽象方法，负责学生学习功能

    public void teacher(String teaName, Student student) {
        student.Study(IdCard, name);
        System.out.println(teaName + "教学号为" + IdCard + "的" + name);
    }

    public Student(String teaName, String name) { // 构造方法
        this.IdCard = teaName;
        this.name = name;
    }

    public void print() {
        System.out.println("这是学号为" + this.getIdCard() + "的学生" + this.getName());
    }

}
