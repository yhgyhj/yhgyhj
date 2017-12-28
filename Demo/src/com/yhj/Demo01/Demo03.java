package com.yhj.Demo01;

 /** 
  * @ClassName: Demo03.java
  * @Description: 
  * @author: yhg
  * @date: 2017年12月20日
 */
public class Demo03 {
	 public static void main(String[] args) {
	        // 三目运算符
	        String s=2>3?"表达式为真":"表达式为假";
	        System.out.println(s);
	        boolean b=2>3?true:false;
	        System.out.println(b);
	        //两个数字的交换
	        int a=3,v=5;
	        int c;
	        c=a;
	        a=v;
	        v=c;
	        System.out.println("a="+a+",v="+v);
	        //三个数中的最大最小值
	        int a1=3,b1=5,c1=1;
	        int min=a1; // 定义变量min 用来存储最小值 初始值a
	        int max=a1; // 定义变量max 用来存储最大值 初始值a
	        if(b1<min){
	            min=b1;
	        }
	        if(c1<min){
	            min=c1;
	        }
	         
	        if(b1>max){
	            max=b1;
	        }
	        if(c1>max){
	            max=c1;
	        }
	        System.out.println("a,b,c中最大值："+max+"，最小值："+min);
	    }
	}
