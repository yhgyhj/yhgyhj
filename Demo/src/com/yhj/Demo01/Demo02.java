package com.yhj.Demo01;

 /** 
  * @ClassName: Demo02.java
  * @Description: 
  * @author: yhg
  * @date: 2017年12月20日
 */
public class Demo02 {
	public static void main(String[] args) {
        // 定义一个单个字符
        char c1='A';
        char c2='b';
        char c3='4';
        System.out.println("c1="+c1);
        System.out.println("c2="+c2);
        System.out.println("c3="+c3);
         
        // 转义字符
        char c4='\\';
        System.out.println("c4="+c4);
         
        // 用Unicode编码输出自己的名字
        char c5='\u6768';
        char c6='\u6770';
        System.out.println("c5="+c5);
        System.out.println("c6="+c6);
        boolean b1=true;
        System.out.println("b1="+b1);
         
        // 定义一个布尔类型的变量b2
        boolean b2=false;
        System.out.println("b2="+b2);
        //基本类型的类型转换
     // 自动类型转换
        short s=1;
        int i;
        // 自动类型转换 short类型转成int类型
        i=s;
        System.out.println("i="+i);
         
        // 强制类型转换
        double d=1.333;
        float f;
        // 把double类型的数据强制转换成float类型
        f=(float)d;
        System.out.println("f="+f);
        //运算符 
        int a=10;
        int b=3;
        // +运算符
        System.out.println(a+"+"+b+"="+(a+b));
        // -运算符
        System.out.println(a+"-"+b+"="+(a-b));
        // *运算符
        System.out.println(a+"*"+b+"="+(a*b));
        // /运算符
        System.out.println(a+"/"+b+"="+(a/b));
        // %运算符
        System.out.println(a+"%"+b+"="+(a%b));
    }
}

