package com.yhj.Demo02;

/** 
 * @ClassName: Demo17.java
 * @Description: 
 * @author: yhg
 * @date: 2017年12月22日
 */
public class Demo17 {
	//非递归
	static long asd(int n) {
		long rest=1;
		for(int i=1;i<=n;i++) {
			rest=rest*i;
		}
		return rest;
	}
	//递归
	static int asx(int n) {
		//出口
		if(n==1) {
			return 1;
		}
		//递归调用 a调用自身
		int a=asx(n-1)*n;
		return a;
	}
	//作业
	long shuzu(int n) { 
		//出口
		if (n==1||n==2)
		{
		return 1;
	     }
	//递归调用 shuzu调用自身
	return shuzu(n-1)+shuzu(n-2);
	}
	

	public static void main(String[] args) {
		System.out.println(Demo17.asd(5));
		System.out.println(Demo17.asx(5));
		System.out.println(new Demo17().shuzu(40));
	}
}
