package com.yhj.Demo;

 /** 
  * @ClassName: demo02.java
  * @Description: 
  * @author: yhg
  * @date: 2017年12月13日
 */
public class Demo02 {
	 public static void main(String[] args){
		    int a1=1;
		    System.out.println("a1="+a1);
		    //自动转换类型有两个要求
		    //1转换前后的数据兼容
		    //2转换前的类型范围要小于转换后的类型范围
		    byte a2=3;
		    int a3;
		    a3=a2;
		    System.out.println("a3="+a3);
		    //强制转换类型
		    //数据类型不兼容，是一个不安全的类型转换
		    double  b2=0.333;
		    float b3;
		    b3=(float)b2;
		    System.out.println("b3");
		    //运算符
		    int c1=10;
		    int c2=20;
		    //如果不加（）的输出结果是拼接起来的没有用到运算符
		    System.out.println(c1+"+"+c2+"="+c1+c2);
		    System.out.println(c1+"-"+c2+"="+(c1-c2));
		    System.out.println(c1+"*"+c2+"="+(c1*c2));
		    System.out.println(c2+"/"+c1+"="+(c2/c1));
		    System.out.println(c1+"%"+c2+"="+(c1%c2));
		    System.out.println(c1+"+"+c2+"="+(c1+c2));
		    //自增运算
		    int d1=1;
		    int d2=d1++;
		    //d1++表示先赋值，后自增
		    System.out.println("d2="+d2);
		    System.out.println("d1="+d1);
		    int e1=1;
		    int e2=++e1;
		    //++e1 表示先自增 后赋值
		    System.out.println("e1="+e1);
		    System.out.println("e2="+e2);
		    //自减运算
		    System.out.println("==============================");
		    int f1=10;
		    //--f1表示先自减 后赋值
		    int f2=--f1;
		    System.out.println("f1="+f1);
		    System.out.println("f2="+f2);
		    int g1=10;
		    //g1-- 表示先赋值 后自减
		    int g2=g1--;
		    System.out.println("g1="+g1);
		    System.out.println("g2="+g2);
		   //关系运算符 ==等于 ！=非等于 >大于号<小于号>=大于等于<=小于等于
		    int h1=1;
		    int h2=2;
		    System.out.println(h1+"=="+h2+":"+(h1==h2));
		    System.out.println(h1+"！="+h2+":"+(h1!=h2));
		    System.out.println(h1+"<"+h2+":"+(h1<h2));
		    System.out.println(h1+">"+h2+":"+(h1>h2));
		    System.out.println(h1+"<="+h2+":"+(h1<=h2));
		    System.out.println(h1+">="+h2+":"+(h1>=h2));
	   }
}
