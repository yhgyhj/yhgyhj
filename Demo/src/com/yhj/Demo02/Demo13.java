package com.yhj.Demo02;
public class Demo13 {  
  //值传递
    void speak(int age){
        System.out.println("我今年"+age+"岁了");
        age=24; // 作用范围是方法里
    }
      public static void main(String[] args) {
    	Demo13 xiaoli=new Demo13();
        int age=23;
		xiaoli.speak(age);
        System.out.println(age);
    }
}