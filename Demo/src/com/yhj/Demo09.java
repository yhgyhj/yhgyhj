package com.yhj;

 /** 
  * @ClassName: Demo03.java
  * @Description: 
  * @author: yhg
  * @date: 2017年12月20日
 */
public class Demo09 {
	public static void main(String[] args) {
        // 定义一个数组
        int []arr;
        // 定义一个数组
        int arr2[];
     // 定义一个数组，并且静态初始化
        int ar[]=new int[]{1,2,3};
         
        // 普通的遍历数组方式
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
         
        System.out.println("---------------");
        // foreach方式
        for(int j:ar){
            System.out.println(j);
        }
        // 定义一个数组，然后动态初始化，长度是3
        int a[]=new int[3];
        // int类型的数组，默认是0
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        //二维数组
        //静态初始化实例
        int [][]arre=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<arre.length;i++){
            for(int j=0;j<arre[i].length;j++){
                System.out.print(arre[i][j]+" ");
            }
            System.out.println();
        }
        //二维数组
        //动态初始化实例：
        int [][]arrs=new int[3][3];
        
        for(int i=0;i<arrs.length;i++){
            for(int j=0;j<arrs[i].length;j++){
                System.out.print(arrs[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
