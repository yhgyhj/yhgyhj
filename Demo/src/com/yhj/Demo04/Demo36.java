package com.yhj.Demo04;

 /** 
  * @ClassName: Demo36.java
  * @Description: 
  * @author: yhg
  * @date: 2018年1月3日
 */
//try ......catch.....finally 异常
public class Demo36 {
	public static void stace() {
      String a="123q";
      try {
    	  int i=Integer.parseInt(a);
      }catch(Exception e) {
    	e.printStackTrace(); 
    	System.out.println("出错了");
    	return;
      }finally {
    	  System.out.println("继续执行1");
      }	
	}
	public static void main(String[] args) {
		stace();
		}
}
