package com.yhj.Demo02;

 /** 
  * @ClassName: Demo03.java
  * @Description: 
  * @author: yhg
  * @date: 2017年12月20日
 */
public class Demo11 {
	  String name; // 在类中，定义一个姓名name字符串属性 可以存在字符串 类似"张三"
	    int age; // 在类中，定义一个年龄age属性
	     
	    /**
	     * 定义一个方法  public表示共有 权限最大  void表示返回值是空  speak是方法名 括号里可以加参数
	     */
	    public void speak(){
	        System.out.println("我叫"+name+" 我今年"+age);
	    }
	     
	    public static void main(String[] args) {
	        // 定义一个Person类的对象zhangsan
	    	Demo11 zhangsan;
	        // 实例化对象
	        zhangsan=new Demo11();
	        //或使用这个来实例化对象  
	        //Demo11 名字=new Demo11();
	        // 给对象的name属性赋值
	        zhangsan.name="张三";
	        // 给对象的age属性赋值
	        zhangsan.age=23;
	        zhangsan.speak(); // 调用对象的方法
	    }
	}