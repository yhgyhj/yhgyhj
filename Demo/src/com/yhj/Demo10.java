package com.yhj;

/** 
 * @ClassName: Demo03.java
 * @Description: 
 * @author: yhg
 * @date: 2017年12月20日
 */
public class Demo10 {
	public static void main(String[] args) {
		int arr[]=new int[]{4,21,0,-12,-3};
		int aar[]= new int[]{4,5,6,7,820,80,9};
		int aaa[]= {0,0,0,0,0,0,1,2,3,4,5,0,0,0,0};
		int o=0;
		int jishu=0;
		int oushu=0;
		//数组中的奇数和偶数
		for(int i=0;i<aar.length;i++)
		{ if(aar[i]%2==1) {
			jishu++;
		}
		if(aar[i]%2==0) {
			oushu++;  
		}
		}
		System.out.println("数组中的奇数个数："+jishu);
		System.out.println("数组中的偶数个数："+oushu);
		int ssr ;
		int min=arr[0];
		int max=arr[0];
		//数组的冒泡排序
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]) {
					ssr=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=ssr;
				}
			}
		}
		for(int a:arr){
			System.out.print(a+" ");
		}
		System.out.println();
		//数组中的最大值和最小值
		for(int i=1;i<arr.length;i++) 
		{
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("最大值"+min);
		System.out.println("最小值"+max);
		//去除数组中的0
		for(int i=0;i<aaa.length;i++)
		{ if(aaa[i]==0){
			o++;
		}
		}
		int rrr[]=new int[aaa.length-o];
		int y=0;
		for(int i=0;i<aaa.length;i++) {
			if(aaa[i]!=0){
				rrr[y]=aaa[i];
				y++;
			}
		}
		System.out.println("旧的数组中有"+o+"个0");
       System.out.println("新的数组");
       for(int n:rrr) {
    	   System.out.print(n+"");
       }

		
	}
}