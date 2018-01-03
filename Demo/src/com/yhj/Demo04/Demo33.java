package com.yhj.Demo04;

 /** 
  * @ClassName: Demo33.java
  * @Description: 
  * @author: yhg
  * @date: 2018年1月2日
 */
//包装类
public class Demo33 {
public static void main(String[] args) {
	 int a=1;
	 //装箱
	 Integer i2= new Integer(a);
	 //拆箱
	 int i3=i2.intValue();
	 System.out.println("a="+a);
	 System.out.println("i2="+i2);
	 System.out.println("i3="+i3);
	 //自动装箱
	 Integer z=1;
	 //自动拆箱
	 int x=z;
	 System.out.println("z="+z);
	 System.out.println("x="+x);
	 String c="2";
	 String b="3";
	 int c2=Integer.valueOf(c);
	 int b2=Integer.valueOf(b);
	 System.out.println("C+B="+(c2+b2));
}
}
