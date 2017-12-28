package com.yhj.Demo03;

 /** 
  * @ClassName: Demo2702.java
  * @Description: 
  * @author: yhg
  * @date: 2017年12月29日
 */
//实现Demo27这个接口  
//实现两个接口  
//继承方法加实现接口（继承要写在实现前面）
//Demo2702,Demo2703这两个接口可以删掉的因为Demo2705接口继承了Demo2702,Demo2703这两个接口
public class Demo27 extends Demo2704 implements Demo2702,Demo2703,Demo2705{
	public void a() {
		System.out.println("实现了Demo2702的接口 a");
	}
	public void b() {
		System.out.println("实现Demo2703的接口b");		
	}
	public void d() {
		System.out.println("接口继承接口");	
	}
	public static void main(String[] args) {
		Demo27 ts=new Demo27();
		ts.a();
	    //Demo2702接口中的常量
		System.out.println(ts.di);
		ts.b();
		//Demo2703接口中的常量
		System.out.println(ts.as);
		ts.c();
		ts.d();
	}
	

}
