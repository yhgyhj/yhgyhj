package com.yhj.Demo04;

 /** 
  * @ClassName: Demo3202.java
  * @Description: 
  * @author: yhg
  * @date: 2018年1月2日
 */
public class Demo3202 {
	public void zx(Demo32 a){
		a.asd();
	}
   public static void main(String[] args) {
	 Demo3202 as=new Demo3202();
	 //匿名内部类
	 as.zx(new Demo3203());
	 //匿名内部类对象
	 as.zx(new Demo32() {
		public void asd() {
			System.out.println("匿名内部类，只能使用一次");
		}
	});
}
}
