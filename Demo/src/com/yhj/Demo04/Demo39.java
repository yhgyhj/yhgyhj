package com.yhj.Demo04;

import sun.security.krb5.RealmException;

/** 
 * @ClassName: Demo39.java
 * @Description: 
 * @author: yhg
 * @date: 2018年1月3日
 */
//RuntimeException异常和Exception异常的区别
public class Demo39 {
	/**
	 * 运行时异常，编译时不检查，可以不使用try...catch捕获
	 * @throws RuntimeException
	 */
	public static void asd()throws RuntimeException {
		throw new RuntimeException("运行时异常");
	}
	/**
	 * Exception异常，编译时会检查，必须使用try...catch捕获
	 * @throws Exception
	 */
	public static void asc()throws Exception{
		throw new Exception("Exception异常");
	}
	public static void main(String[] args) {
		try {
			asc();
		} catch (Exception e) {
			e.printStackTrace();
		}
		asd();
	}
}
