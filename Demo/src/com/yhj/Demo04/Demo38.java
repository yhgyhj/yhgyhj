package com.yhj.Demo04;

 /** 
  * @ClassName: Demo38.java
  * @Description: 
  * @author: yhg
  * @date: 2018年1月3日
 */
//throw 业务异常
public class Demo38 {
   public static void zxc(int a)throws Exception{
	   if(a==1){
		// 直接抛出一个异常类
		   throw new  Exception("有异常");
	   }
	   System.out.println(a);
   }
   public static void main(String[] args) {
	   try {
		zxc(0);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
