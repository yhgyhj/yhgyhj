package com.yhj.Demo04;

 /** 
  * @ClassName: Demo34.java
  * @Description: 
  * @author: yhg
  * @date: 2018年1月2日
 */
//单例
public class Demo34 {
	/*
	 * 构造方法私有
	 */
  private  Demo34() {
	 
  }
  /*
   * 饿汉模式
   */
  //内部实例化一个静态的常量构造方法
   public static final  Demo34 demo=new Demo34();
     //只有静态方法才能调用静态方法
   //获取实例
     public static Demo34 getInstance() {
		return demo;
   }
     /*
      * 懒汉模式
      */
     public static Demo34 demo2=null;
     public synchronized static Demo34 getInstances() {
    	 if(demo2==null) {
    		 System.out.println("第一次调用");
    		 demo2= new Demo34();
    	 }
 		return demo;
    }
}
