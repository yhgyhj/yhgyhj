package com.yhj.Demo03;

 /** 
  * @ClassName: Demo2502.java
  * @Description: 
  * @author: yhg
  * @date: 2017年12月28日
 */
//报错final声明的类不能被继承；
public class Demo2502 //extends Demo25  
extends Demo25
{   /*//使用final声明的方法不能被子类覆盖
	public final void asc() {
    	System.out.println("你是傻逼");
    }*/
	public static void main(String[] args) {
	  /*//报错final声明的变量不能被修改，即为常量
	   Demo25.ya="上海";*/
	System.out.println(Demo25.ya);
}
}
