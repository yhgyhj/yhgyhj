package com.yhj.Demo02;

 /** 
  * @ClassName: Demo22.java
  * @Description: 
  * @author: yhg
  * @date: 2017年12月28日
 */
public class Demo22 {
    public static void main(String[] args) {
    	//实例化String的第一种方法
    	//创建的对象直接存放在字符对象池里 ，假如存在的，就不在创建
		String name1="杨豪杰";
		String action="杨豪杰";
		System.out.println("name1="+name1);
		//实例化String的第二种方法
		//new 每次创建一个String都要创建一个新的对象
		String name2=new String("杨豪杰");
		String admin=new String("杨豪杰");
		System.out.println("name2="+name2);
		String name3=name2;//传递引用
		//==和equals对比的差别
	    //==是引用比较（就是内存地址比较）
		System.out.println("name1==name2:"+(name1==name2));
		System.out.println("name3=name1:"+(name3==name1));
		System.out.println("name2=name3:"+(name2==name3));
		//equal是具体内容比较
		System.out.println("name1.equals(name2):"+(name1.equals(name2)));
		System.out.println("name2.equals(name2):"+(name2.equals(name3)));
		System.out.println("name3.equals(name1):"+(name3.equals(name1)));
		//两种实例化String方法的比较 用==（内存比较）
		System.out.println("name1==action: "+(name1==action));
		System.out.println("name2=admin:"+(name2==admin));
		/*
		 * 字符串的特性：不能改变字符串的内容；
		 *  要想改变，只能通过指向一个新的内存地址；
		 */
		 // name="张"会被自动回收 重新赋值name="张三"
	        String name="张";
	        name+="三";
	        System.out.println(name);
	    }
	}
