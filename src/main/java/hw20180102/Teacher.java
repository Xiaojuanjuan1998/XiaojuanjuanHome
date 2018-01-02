/**
 * Project Name:dt59homework
 * File Name:Teacher.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午7:28:52
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午7:28:52 <br/>
 * 
 * @author luojuan
 * @version
 * @see
 */
public class Teacher {

    private String teaName;

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    // 老师教学生
    public Teacher(String teaName) {
        this.teaName = teaName;
    }
}
