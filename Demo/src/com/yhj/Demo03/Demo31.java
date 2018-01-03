package com.yhj.Demo03;

 /** 
  * @ClassName: Demo3104.java
  * @Description: 
  * @author: yhg
  * @date: 2017年12月29日
 */
//instanceof判断这个子类是否属于这个父类
public class Demo31 {
	public static void sta(Demo3102 demo3102 ) {
		demo3102.asd();
		  if(demo3102 instanceof Demo3103){
	           ((Demo3103) demo3102).f1();;
	        }else if(demo3102 instanceof Demo3104){
	            ((Demo3104) demo3102).f2();
	        }
	}
   public static void main(String[] args) {
	Demo3102 demo3102=new Demo3103();
	System.out.println("demo3102对象是否属于Demo3102类："+(demo3102 instanceof Demo3102));
	System.out.println("demo3102对象是否属于Demo3103类："+(demo3102 instanceof Demo3103));
	System.out.println("demo3102对象是否属于Demo3104类："+(demo3102 instanceof Demo3104));
	sta(new Demo3103());
	sta(new Demo3104());
}
}
