package com.yhj.Demo04;

 /** 
  * @ClassName: Demo3402.java
  * @Description: 
  * @author: yhg
  * @date: 2018年1月2日
 */
public class Demo3402 {
 public static void main(String[] args) {
	/*//私有的构造方法不能被实例化
	 Demo34  demo=new Demo34();*/
	 //验证是否获取的是同一个对象
	 Demo34 de=Demo34.getInstance();
	 Demo34 dem=Demo34.getInstance();
	 System.out.println("de==dem="+(de==dem));
	 //验证是否获取的是同一个对象
	 Demo34 demo=Demo34.getInstances();
	 Demo34 demo2=Demo34.getInstances();
	 System.out.println("demo==demo2="+(demo==demo2));
 }
}
