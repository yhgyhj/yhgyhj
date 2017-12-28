package com.yhj.Demo03;

 /** 
  * @ClassName: Demo25.java
  * @Description: 
  * @author: yhg
  * @date: 2017年12月28日
 */
/*
 *  使用final声明的类不能被继承；
 *  使用final声明的方法不能被子类覆盖；
 *  使用final声明的变量不能被修改，即为常量；
 */
//使用final声明的类不能被继承；
public //final 
class Demo25 {
	//使用final声明的变量不能被修改，即为常量；
    public final String a="asd"; 
  /*  public void asd() {
    	
    	 * 报错final声明的变量不能被修改，即为常量
    	 * 
    	//a="52";
    }*/
    public static final String ya="北京";
    // 使用final声明的方法不能被子类覆盖；
    public final void asc() {
    	System.out.println("你是傻逼");
    }
}
