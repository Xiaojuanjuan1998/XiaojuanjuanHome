package dt59homework;
/**
 * Project Name:Lesson2
 * File Name:Main.java
 * Package Name:
 * Date:2017��12��24������11:12:21
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

/**
 * Description: <br/>
 * Date: 2017��12��24�� ����11:12:21 <br/>
 * 
 * @author Administrator
 * @version
 * @see
 */
public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.name = "baby";
        dog.sex = "��";
        dog.weight = 20;

        System.out.println("����: " + dog.name + '\n' + "�Ա�: " + dog.sex + '\n' + "����: " + dog.weight + '\n');
        dog.eat();
        dog.sleep();
        dog.hobby();
        dog.police();

    }

}
