package com.yhj.Demo03;

 /** 
  * @ClassName: Demo26.java
  * @Description: 
  * @author: yhg
  * @date: 2017年12月28日
 */
/* 抽象类和抽象方法都要用abstract关键字修饰；
 * 定义一个抽象方法
 * 包含一个抽象方法的类是抽象类
 */
public abstract class Demo26 {
	public String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void asd() {
	System.out.println("我的名字叫"+this.getName());
	}
	//定义一个抽象类 让子类实现
	//抽象方法只需要声明而不需要实现
	public abstract void zhiye();
}
