package com.yhj.Demo01;

 /** 
  * @ClassName: Demo03.java
  * @Description: 
  * @author: yhg
  * @date: 2017年12月20日
 */
public class Demo08 {
	public static void main(String[] args) {
		//循环结构的控制
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print("i="+i+" "+"j="+j+" ");
            }
            System.out.println();
        }
        //break 结束内层的整个循环
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(i==1){
                    break;
                }
                System.out.print("i="+i+" "+"j="+j+" ");
            }
            System.out.println();
        }
        //break 还有一个break标签 我们可以从内层跳到外层，结束外层循环；
        outer:
            for(int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    if(i==1){
                        break outer;
                    }
                    System.out.print("i="+i+" "+"j="+j+" ");
                }
                System.out.println();
            }
        //continue是结束当前循环
        for(int i=1;i<=10;i++){
            if(i==3 || i==6){
                continue;
            }
            System.out.print("i="+i+" ");
        }
        //return直接结束方法
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(i==1){
                    return;
                }
                System.out.print("i="+i+" "+"j="+j+" ");
            }
            System.out.println();
        }
        System.out.println("执行到这里");
    }
    }

