package com.yhj.Demo02;

 /** 
  * @ClassName: Demo21.java
  * @Description: 
  * @author: yhg
  * @date: 2017年12月27日
 */
public class Demo21{
	{
		System.out.println("构造快");
	}
	static {
		System.out.println("静态代码块");
	}
    public Demo21(){
    	System.out.println("构造方法一");
    }
    public Demo21(int a){
    	System.out.println("构造方法二");
    }
    public Demo21(int a,int b){
    	System.out.println("构造方法三");
    }
    public static void main(String[] args) {
		 int a=2;
		 /*
		  * 普通代码块
		  * 自己理解一下没多大用处
		  */
		 {
			 a=3;
			 System.out.println("普通代码块");
		 }
		 System.out.println("a="+a);
		 //匿名类
		 new Demo21();
		 new Demo21(1);
		 new Demo21(1,2);
	}
}
