package com.neuedu.test.chapter3;

public class Test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//判断一个数是不是质数
		for(int num=200;;num++)
		{
		boolean flag = true;//是质数
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				flag = false;//不是质数
				//整除了
				//System.out.println("不是质数");
				break;
			}
		}
		if(flag)//一个都没整除
		{
			//break到这了
			//System.out.println("是质数");
			//找到了
			System.out.println(num);
			break;
		}
	}
		
  }

}
