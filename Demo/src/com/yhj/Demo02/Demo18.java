package com.yhj.Demo02;

 /** 
  * @ClassName: Demo18.java
  * @Description: 
  * @author: yhg
  * @date: 2017年12月25日
 */
public class Demo18 {
   private String name;
   private int age;
   //默认的参数方法
   Demo18(){
	   System.out.println("默认的构造方法");
   }
   /*//自己定义的有参数方法
   Demo18(String name2,int age2){
	   System.out.println("有参数的构造方法");
	   name=name2;
	   age=age2;
   }*/
   /*
    * 用this关键字 定义有参数的方法
    */
   Demo18(String name,int age){
	   //调用默认的构造方法
	   this();
	   System.out.println("有参数的构造方法");
	   this.name=name;
	   this.age=age;
   }
   public void sta() {
	   System.out.println("我叫"+name+"今年"+age);
   }
   public static void main(String[] args) {
	//Demo18 demo=new Demo18();
	Demo18 demo=new Demo18("杨豪杰",20);
	demo.sta();
}
}
