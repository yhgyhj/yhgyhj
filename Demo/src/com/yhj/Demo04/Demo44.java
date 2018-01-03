package com.yhj.Demo04;

 /** 
  * @ClassName: Demo44.java
  * @Description: 
  * @author: yhg
  * @date: 2018年1月3日
 */
//String跟Stringbuffer的区别
public class Demo44 {
	 public static void main(String[] args) {
		 //string是把字符存堆中，如果在后面追加新的字符的话String是重新又在堆中开辟一块内存，原本的会被回收掉
	        String str="123";
	        str+="abc";
	        System.out.println(str);
	     // StringBuffer也是把字符存堆中，如果在后面追加新的字符的话StringBuffer是在原本的堆上更改的
	        StringBuffer sb=new StringBuffer("123");
	        sb.append("abc");
	        System.out.println(sb.toString());
	    }
}
