package com.yhj.Demo03;

/** 
 * @ClassName: Demo2804.java
 * @Description: 
 * @author: yhg
 * @date: 2017年12月29日
 */
//多态测试，父类引用指向子类具体实现
public class Demo2804 {
	public static void main(String[] args) {
		//向上转型：子类对象->父类对象 安全
		Demo28 demo28=new Demo2802();
		demo28.asd();
		//向上转型：子类对象->父类对象 安全
		//随时更换为其他子类的具体实现
		//更换实现
		demo28=new Demo2803();
		demo28.asd();
		//向下转型：父类对象->子类对象 不安全
		//强制类型转换 （如果有两个向上转型会报无法转型。一个向上转型可以成功）
		Demo2802 demo2802=(Demo2802)demo28;
		demo2802.asd();
		//向下转型：更换实现 (会报不能转换)
		Demo2803 demo2803=(Demo2803) demo28;
		demo2803.asd();
	}
}
