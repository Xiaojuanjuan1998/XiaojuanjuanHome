/**
 * Project Name:dt59homework
 * File Name:Mains.java
 * Package Name:dt59homework
 * Date:2017年12月24日下午9:33:33
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package dt59homework;

/**
 * Description: <br/>
 * Date: 2017年12月24日 下午9:33:33 <br/>
 * 
 * @author Administrator
 * @version
 * @see
 */
public class Mains {

    public static void main(String[] args) {

        Dogs dog = new Dogs();
        dog.name = "baby";
        dog.sex = "男";
        dog.weight = 20;

        System.out.println("姓名: " + dog.name + '\n' + "性别: " + dog.sex + '\n' + "体重: " + dog.weight + '\n');
        dog.eat();
        dog.sleep();
        dog.hobby();
        dog.police();

    }

}
