package com.yhj.Demo04;

 /** 
  * @ClassName: Demo35.java
  * @Description: 
  * @author: yhg
  * @date: 2018年1月2日
 */
//异常
public class Demo35 {
public static void main(String[] args) {
	String a="123a";
	try {
		int i=Integer.parseInt(a);
	}catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println("继续执行");
}
}
