package com.yhj.Demo04;

 /** 
  * @ClassName: Demo4002.java
  * @Description: 
  * @author: yhg
  * @date: 2018年1月3日
 */
public class Demo4002 {
  public static void asd()throws Demo40{
	  throw new Demo40("自定义异常");
  }
  public static void main(String[] args) {
	try {
		asd();
	} catch (Demo40 e) {
		e.printStackTrace();
	}
}
}
