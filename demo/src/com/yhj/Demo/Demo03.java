package com.yhj.Demo;

 /** 
  * @ClassName: Demo03.java
  * @Description: 
  * @author: yhg
  * @date: 2017年12月14日
 */
public class Demo03 {
   public static void main(String[]args){
	   //&& 与前后两个操作同时返回 true才返回true 否则返回false
	   //&& 短路与 如果第一个返回false 则不执行后面的方法
	   //一个false 一个true
	   boolean a1=(2<1)&&(2>1);
	   System.out.println("a1="+a1);
	   //两个true
	   boolean a2=(1<2)&&(2>1);
	   System.out.println("a2="+a2);
	   //两个false
	   boolean a3=(1>2)&&(2<1);
	   System.out.println("a3="+a3);
	   //& 前后两个操作同时返回true才返回true 否则返回false
	   //& 不短路与  如果第一个放回false 继续执行后面的方法
	   //两个true
	   boolean b1=(4<5)&(5>4);
       System.out.println("b1="+b1);
       //一个 true 一个false
       boolean b2=(5>4)&(4>5);
       System.out.println("b2="+b2);
       //两个false
       boolean b3=(4>5)&(5<4);
       System.out.println("b3="+b3);
       //一般情况下都用&&
       //原因：效率高
//===============================================================================
       //||或  只要两个操作中有一个返回true就返回true 否则返回false
       //|| 短路或  如果第一个返回true 后面的就不执行了
       //一个false 一个true
       boolean c1=(2<1)||(2>1);
       System.out.println("c1="+c1);
       //两个true
       boolean c2=(1<2)||(2>1);
       System.out.println("c2="+c2);
       //两个false
       boolean c3=(1>2)||(2<1);
       System.out.println("c3="+c3);
      //|或  只要两个操作中有一个返回true就返回true 否则返回false
       //| 不短路或  如果第一个返回true 后面的还要继续执行
       //一个true 一个false
       boolean d1=(2>1)|(2<1);
       System.out.println("d1="+d1);
       //两个true
       boolean d2=(1<2)|(2>1);
       System.out.println("d2="+d2);
       //两个false
       boolean d3=(1>2)|(2<1);
       System.out.println("d3="+d3);
  //=========================================================================
       // ! 非 ，如果操作数为true，返回false，否则，返回true
       //一个false
       boolean e1=!(3>4);
       //结果teue
       System.out.println("e1="+e1);
       //一个true
       boolean e2=!(4>3);
       //结果false
       System.out.println("e2="+e2);
      //=====================================================
       
       // ^ 异或 ，当两个操作数不相同时返回true，返回false
       //一个false 一个true
       boolean f1=(5>4)^(4>5);
       System.out.println("f1="+f1);
       //两个true
       boolean f2=(5>4)^(4<5);
       System.out.println("f2="+f2);
       //两个false
       boolean f3=(4>5)^(5<4);
       System.out.println("f3="+f3);
   }
}
