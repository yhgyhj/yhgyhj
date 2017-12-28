package com.yhj.Demo03;

 /** 
  * @ClassName: Demo24.java
  * @Description: 
  * @author: yhg
  * @date: 2017年12月28日
 */
public class Demo24 {
	//继承
    private String name;
    private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
     /*
      * 父类无参数的构造方法
      */
     Demo24(){
    	 System.out.println("父类无参数的构造方法");
     }
     /*
      * 父类有参数的构造方法
      */
 	public Demo24(String name, int age) {
		System.out.println("父类有参数的构造方法");
		this.name = name;
		this.age = age;
	}
	
	public void asd() {
    	 System.out.println("我是一只动物，我叫"+this.getName()+"我今年"+this.getAge()+"岁");
     }
}
