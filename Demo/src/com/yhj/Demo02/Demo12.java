package com.yhj.Demo02;

 /** 
  * @ClassName: Demo03.java
  * @Description: 
  * @author: yhg
  * @date: 2017年12月20日
 */
public class Demo12 {
	//方法的定义及简单使用
	
	//无参数
	void asd(){
        System.out.println("我叫杨豪杰");
    } 
	//一个参数 这里的name是形参
	 void asf(String name){
	        System.out.println(name);
	    }
	 
	 //两个参数
	 //多个参数用,号隔开
	 //这里name和age是形参 
	 void asg(String name,int age){
	        System.out.println("我叫"+name+",我今年"+age+"岁了");
	    }
	 //不固定参数
	 void ask(String name,int age,String ...hobbies){
	        System.out.println("我叫"+name+",我今年"+age+"岁了");
	        for(String hobby:hobbies){
	            System.out.println(hobby+" ");
	        }
	    }
	 //返回一个参数
	 int zxc(String name,int age,String ...hobbies){
	        System.out.println("我叫"+name+",我今年"+age+"岁了");
	        for(String hobby:hobbies){
	            System.out.println(hobby+" ");
	        }
	        // 获取爱好的长度
	        int totalHobbies=hobbies.length;
	        return totalHobbies;
	    }
    public static void main(String[] args) {
    	Demo12 person=new Demo12();
        person.asd();
        //这里的name是实参
        person.asf("杨豪杰");
        //这里的name和age是实参
        person.asg("杨豪杰",20);
        person.ask("杨豪杰",20,"游泳","唱歌");
        int n=person.zxc("杨豪杰",20);
        System.out.println("有"+n+"个爱好");
        int q=person.zxc("杨豪杰",20,"游泳","唱歌");
        System.out.println("有"+q+"个爱好");
    }
}
