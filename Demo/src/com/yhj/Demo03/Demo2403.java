package com.yhj.Demo03;

 /** 
  * @ClassName: Demo2403.java
  * @Description: 
  * @author: yhg
  * @date: 2017年12月28日
 */
public class Demo2403 extends Demo24 {
	/**
	 * 子类无参数构造方法
	 */
	private String  address;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//子类无参数构造方法
	public Demo2403(){
		 System.out.println("子类无参数构造方法");
	 }
	//子类有参数构造方法
	 public Demo2403(String name,int age,String address){
		//super是用来调用父类的方法的也可以调用父类的变量
		 super(name,age);
		 this.address=address;
		 System.out.println("子类有参数构造方法");
	 }
	/**
	 *父类方法的重写
	 */
	public void asd() {
		System.out.println("我是一只猫，我叫"+this.getName()+"我今年"+this.getAge()+"地址是"+this.getAddress());
	}
	public static void main(String[] args) {
		Demo2403 sd=new Demo2403("咪咪",12,"冥王星");
		sd.asd();
	}
}
