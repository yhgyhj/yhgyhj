package com.yhj.Demo02;


/** 
  * @ClassName: Demo2002.java
  * @Description: 
  * @author: yhg
  * @date: 2017年12月27日
 */
public class Demo2002 {
	public static void main(String[] args) {
		Demo20 s=new Demo20();
		//调用内部类
		Demo20.set a=s.new set();
		a.asd();
	}
}
