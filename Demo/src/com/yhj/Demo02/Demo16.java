package com.yhj.Demo02;
 /** 
  * @ClassName: Demo16.java
  * @Description: 
  * @author: yhg
  * @date: 2017年12月22日
  */
public class Demo16 {
	//static静态方法与普通方法
	/*所谓静态方法 是加了static修饰词的方法，我们使用的时候 一般用类名.方法 方式调用；
	当然也可以用对象.方法 调用； 一般java里的工具类里的工具方法 用static修饰，作为静态方法*/
	//定一个普通方法
	void qw(){
		System.out.println("这是一个普通方法");
	}
	static void qwe() {
		System.out.println("这是一个静态方法");
	}
	public static void main(String[] args) {
		Demo16 demo16=new Demo16();
		//调用普通方法 对象.方法
		demo16.qw();
		//调用静态方法   类名.方法
		Demo16.qwe();
		//这个调用可以用 是因为对象.方法的兼容性高
		demo16.qwe();
	}
}
