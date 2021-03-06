package com.yhj.Demo01;

import java.util.Scanner;

/** 
  * @ClassName: Demo03.java
  * @Description: 
  * @author: yhg
  * @date: 2017年12月20日
 */
public class Demo06 {
	public static void main(String[] args) {
        int a=-1;
        // if语句
        // 多行注释快捷方式  ctrl+shift+/
        if(a>0){
            System.out.println(a+"是正数");
        }
         
        // if...else语句
        if(a>0){
            System.out.println(a+"是正数");
        }else{
            System.out.println(a+"不是正数");
        }
         
        // if...else if...else
        if(a>0){
            System.out.println(a+"是正数");
        }else if(a<0){
            System.out.println(a+"是负数");
        }else{
            System.out.println(a+"是0");
        }
        // 在控制台输出1到10
        // while循环语句
        int i=1;
        while(i<=10){
            System.out.print(i+" ");
            i++;
        }
         
        System.out.println("===================");
         
        // do....while 循环语句
        int j=1;
        do{
            System.out.print(j+" ");
            j++;
        }while(j<=10);
         
        System.out.println("===================");
         
        // while和do...while的区别
        // while是先判断后执行 do...while是先执行后判断
         //for循环
        for(int k=1;k<=10;k++){
            System.out.print(k+" ");
        }
      //嵌套的for循环
        for(int m=0;m<10;m++){
            for(int n=0;n<10;n++){
                System.out.print("m="+m+"n="+n+" ");
            }
            System.out.println();
        }
        System.out.println("请输入一个数字：");
        // 定义一个系统输入对象
        // 自动导包  ctrl+shift+o
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.close();
        switch(n){
            case 1:{
                System.out.println("用户输入的是1");
                break;
            }
            case 2:{
                System.out.println("用户输入的是2");
                break;
            }
            default:{
                System.out.println("用户输入的是其他数字");
            }
        }
    }
}
