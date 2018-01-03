package com.yhj.Demo04;

 /** 
  * @ClassName: Demo37.java
  * @Description: 
  * @author: yhg
  * @date: 2018年1月3日
 */
//thows异常
public class Demo37 {
	 /**
     * 把异常向外面抛
     * @throws NumberFormatException
     */
   public static void asd() throws NumberFormatException
   {String a="123a";
   int i=Integer.parseInt(a);
   System.out.println("I="+i);
   }
   public static void main(String[] args) {
	   try {
		   asd();
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("我们在这里处理异常");
	}
	   System.out.println("出错了");
}
}
