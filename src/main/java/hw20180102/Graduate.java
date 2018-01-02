/**
 * Project Name:dt59homework
 * File Name:Graduate.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午4:40:54
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午4:40:54 <br/>
 * 
 * @author luojuan
 * @version
 * @see
 */
public class Graduate extends Student {
    private String sex;

    public Graduate(String name, String sex) {

        super(name, sex);
        this.sex = sex;

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    // 重写父类的print()方法
    @Override
    public void print() {
        super.print();
        System.out.println("这是性别为" + this.getSex());
    }

    public void timeGra() {
        System.out.println("研究生" + super.getName() + "学时三年");
    }

    // 重写研究生学习的方法
    @Override
    public void Study(String IdCard, String name) {
        this.setName("研究生");
        System.out.println(this.getName() + "有专门的研究方向");

    }

}
