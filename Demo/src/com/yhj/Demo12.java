package com.yhj;

 /** 
  * @ClassName: Demo03.java
  * @Description: 
  * @author: yhg
  * @date: 2017年12月20日
 */
public class Demo12 {
	//方法的定义及简单使用
	/*这里定义的方法 如果参数不一样名字可以重复 反之相反  
	如果方法名字一样在调用多个这个方法的时候会报错*/
	//无参数
	void asd(){
        System.out.println("我叫杨豪杰");
    } 
	//一个参数
	 void asf(String name){
	        System.out.println(name);
	    }
	 
	 //两个参数
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
        person.asf("杨豪杰");
        person.asg("杨豪杰",20);
        person.ask("杨豪杰",20,"游泳","唱歌");
        int n=person.zxc("杨豪杰",20,"游泳","唱歌");
        System.out.println("有"+n+"个爱好");
    }
}
