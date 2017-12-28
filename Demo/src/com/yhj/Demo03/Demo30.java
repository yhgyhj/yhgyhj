package com.yhj.Demo03;

/** 
 * @ClassName: Demo30.java
 * @Description: 
 * @author: yhg
 * @date: 2017年12月29日
 */
public class Demo30 {
	//object类里面的equals方法，	tostring方法
	private String name;
	public String getName() {
		return name;
	}
	//重写object的equals方法
	public boolean equals(Object obj) {
		String name=((Demo30)obj).getName();
		return this.name==name;
	}
	//重写object的tostring方法
	public String toString() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Demo30(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		Demo30 p1=new Demo30("杨豪杰");
		Demo30 p2=new Demo30("杨豪杰");
		Demo30 p3=new Demo30("杨宁宁");
		System.out.println(p1.toString());
		System.out.println("p1.equals(p2)="+p1.equals(p2));
		System.out.println("p1.equals(p3)="+p1.equals(p3));
	}	
}
