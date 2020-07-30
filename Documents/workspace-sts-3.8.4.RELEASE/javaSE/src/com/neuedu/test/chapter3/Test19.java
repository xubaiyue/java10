package com.neuedu.test.chapter3;

public class Test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//判断一个数是不是质数
		int n=2;
		int i=2;
		for(;i<=n-1;i++)
		{
			if(n%i==0)
			{
				//整除了
				System.out.println("不是质数");
				break;
			}
		}
		if(i==n)//一个都没整除
		{
			System.out.println("是质数");
		}
		
	}

}
