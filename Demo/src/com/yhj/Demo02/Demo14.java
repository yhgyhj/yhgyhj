package com.yhj.Demo02;

 /** 
  * @ClassName: Demo14.java
  * @Description: 
  * @author: yhg
  * @date: 2017年12月22日
 */ 
class sanWei{
	int a;
	int b;
	int c;
}
public class Demo14 {
	  void speak(int age,sanWei sanwei){
	        System.out.println("我今年"+age+"岁了");
	        System.out.println("三围是"+sanwei.a+","+sanwei.b+","+sanwei.c);
	        age=24; // 作用范围是方法里
	        sanwei.a=900;// 作用范围是方法里
	    }
	      //引用传递
	      public static void main(String[] args) {
	    	Demo14 xiaoli=new Demo14();
	    	sanWei sanwei= new sanWei();
	        int age=23;
	        sanwei.a=90;
	        sanwei.b=60;
	        sanwei.c=90;
	        xiaoli.speak(age,sanwei);
	        System.out.println(age);
	        System.out.println("调用的地方"+sanwei.a);
	    }
}

