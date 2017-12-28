package com.yhj.Demo02;

 /** 
  * @ClassName: Demo15.java
  * @Description: 
  * @author: yhg
  * @date: 2017年12月22日
 */
public class Demo15 {
	/*//方法的重载
	 * 方法的参数个数不一样
	 * 
	 * */   
	int add(int a, int b) 
   {
	   System.out.println("方法一");
	   return a+b;
   }
   int add(int a){
	   System.out.println("方法二");
	   return a;
   }
   /*方法的参数类型不一样
    * 也是方法重载
    */
   int add(int a,String b){
	   System.out.println("方法三");
	   return a+Integer.parseInt(b);
   }
   /*//参数类型一样 返回值不一样 不算是重载  直接会报错的  会报方法重名 
    * long add(int a,int b){
	   System.out.println("方法四");
	   return a+b;
   }*/
   public static void main(String[] args) {
	 Demo15 sc=new Demo15();
	System.out.println(sc.add(1)) ;
	System.out.println(sc.add(2, 3));
	System.out.println(sc.add(8, "9"));
}
}
