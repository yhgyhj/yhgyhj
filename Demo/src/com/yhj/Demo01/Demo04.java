package com.yhj.Demo01;

 /** 
  * @ClassName: Demo03.java
  * @Description: 
  * @author: yhg
  * @date: 2017年12月20日
 */
public class Demo04 {
public static void main(String[] args) {
	//自增
	int a1=1;
    // a1++; 表示先做赋值操作，后自增
    int b1=a1++;
    System.out.println("b1="+b1);
    System.out.println("a1="+a1);
     
    System.out.println("===================");
    // ++a2；表示先自增，后做赋值操作
    int a2=1;
    int b2=++a2;
    System.out.println("b2="+b2);
    System.out.println("a2="+a2);
    System.out.println("=================================");
    //自减
    int a3=1;
    // a1--; 表示先做赋值操作，后自减
    int b3=a1--;
    System.out.println("b1="+b3);
    System.out.println("a1="+a3);
     
    System.out.println("===================");
    // --a2；表示先自减，后做赋值操作
    int a4=1;
    int b4=--a2;
    System.out.println("b2="+b4);
    System.out.println("a2="+a4);
}
}
