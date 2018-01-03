package com.yhj.Demo04;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
 /** 
  * @ClassName: Demo43.java
  * @Description: 
  * @author: yhg
  * @date: 2018年1月3日
 */
//SimpleDateFormat日期格式类
public class Demo43 {
	  public static String formatDate(Date date,String format){
	        String result="";
	        SimpleDateFormat sdf=new SimpleDateFormat(format);
	        if(date!=null){
	            result=sdf.format(date);
	        }
	        return result;
	    }
	    /**
	     * 将日期字符串转换成一个日期对象 
	     * @param dateStr 日期字符串
	     * @param format 格式
	     * @return
	     * @throws ParseException 
	     */
	    public static Date formatDate(String dateStr,String format) throws ParseException{
	        SimpleDateFormat sdf=new SimpleDateFormat(format);
	        return sdf.parse(dateStr);
	    }
	     
	    public static void main(String[] args) throws ParseException {
	        Date date=new Date();
	        System.out.println(formatDate(date,"yyyy-MM-dd"));
	        System.out.println(formatDate(date,"yyyy-MM-dd HH:mm:ss"));
	        System.out.println(formatDate(date,"yyyy年MM月dd日HH时mm分ss秒"));
	        String dataStr="1989-11-02 18:01:41";
	        Date date2=formatDate(dataStr,"yyyy-MM-dd HH:mm:ss");
	        System.out.println(formatDate(date2,"yyyy-MM-dd HH:mm:ss"));
	    }
	}

