package com.neuedu.test.chapter3;

public class Test25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//水仙花数
		for(int i=100;i<=999;i++)
		{
			int a =i%10;
			int b =i/10%10;
			int c =i/100;
			
			if(a*a*a + b*b*b +c*c*c==i){
				System.out.println(i+"是水仙花数");
			}
		}

	}

}
