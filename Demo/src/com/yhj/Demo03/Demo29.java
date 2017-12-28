package com.yhj.Demo03;

 /** 
  * @ClassName: Demo29.java
  * @Description: 
  * @author: yhg
  * @date: 2017年12月29日
 */
//用接口来表达多态是啥
public class Demo29 {
	public static void main(String[] args) {
		//向上转型 子类对象->父类对象 安全
		Demo2902 p1=new Demo2903();
        p1.say();
      //向上转型 子类对象->父类对象 安全
        p1=new Demo2904();
        p1.say();
      //向下转型：父类对象->子类对象 不安全
      //强制类型转换 （如果有两个向上转型会报无法转型。一个向上转型可以成功）
        Demo2903 p2=(Demo2903) p1;
        p1.say();
      //向下转型：更换实现 (会报不能转换)
        Demo2904 p3=(Demo2904) p1;
        p3.say();
    }
}

