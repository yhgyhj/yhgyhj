package com.yhj.Demo03;

 /** 
  * @ClassName: Demo2603.java
  * @Description: 
  * @author: yhg
  * @date: 2017年12月28日
 */
public class Demo2603 extends Demo26{
    /*//抽象类不能被实例化
	Demo26 asd=new Demo26();*/
	@Override
	//抽象类必须被子类（假如不是抽象类）必须重写抽象中的全部抽象方法；
	//
	public void zhiye() {
		System.out.println("职业：学生");
	}
}
