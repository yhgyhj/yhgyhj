package com.yhj.Demo04;

import java.util.Calendar;

/** 
  * @ClassName: Demo42.java
  * @Description: 
  * @author: yhg
  * @date: 2018年1月3日
 */
//Calendar日历类
public class Demo42 {
	   public static void main(String[] args) {
	        Calendar calendar=Calendar.getInstance();
	        System.out.println(calendar.get(Calendar.YEAR));
	        System.out.println(calendar.get(Calendar.MONTH)+1); // 月份从0开始 要+1
	        System.out.println("现在是："+calendar.get(Calendar.YEAR)+"年"
	                +(calendar.get(Calendar.MONTH)+1)+"月"
	                +calendar.get(Calendar.DAY_OF_MONTH)+"日"
	                +calendar.get(Calendar.HOUR_OF_DAY)+"时"
	                +calendar.get(Calendar.MINUTE)+"分"
	                +calendar.get(Calendar.SECOND)+"秒");
	    }
}
