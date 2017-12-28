package com.yhj.Demo02;

/** 
 * @ClassName: Demo23.java
 * @Description: 
 * @author: yhg
 * @date: 2017年12月28日
 */
public class Demo23 {
	public static void main(String[] args) {
		//string类的方法调用
		String ac=" aB232 23 &*( s2 ";
		System.out.println(ac);
		String as=ac.trim();
		System.out.println(as);
		int shuzi=0;
		int yingwen=0;
		int qita=0;
		int kongge=0;
		for(int i=0;i<=as.length()-1;i++){
			char a=as.charAt(i);
			if((a>='a'&& a<='z')||(a>='A' && a<='Z')) {
				yingwen++;
			}else if(a>='0'&&a<='9') {
				shuzi++;
			}else if(a==' ') {
				kongge++;
			}else {
				qita++;
			}
		} 
		System.out.println("数字"+shuzi+"字母"+yingwen+"空格"+kongge+"其他"+qita+"");
		//作业
		//String的排序
		String str="abcdefg";
		String newStr="";
		for(int i=str.length()-1;i>=0;i--){
			newStr+=str.charAt(i);
		}
		System.out.println(newStr);
		System.out.println("======================");
		//字符串变成数组
		String asd="1,2,3,4,5,6";
		int v=0;
		for(int i=0;i<asd.length();i++)
		{
			if(asd.charAt(i)!=',') {
				v++;
			}
		}
		int [] a=new int[v];
		int j=0;
		for(int i=0;i<asd.length();i++) {
			if(asd.charAt(i)!=',') {
				a[j]=Integer.parseInt(asd.charAt(i)+"");
				j++;
			}
		}
		for(int b:a){
		System.out.print(b+" ");
		}
	}
}
