package com.neuedu.test.chapter3;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //4��һ�򣬰��겻��400������
		int year = 2000;
		if(year %400 ==0)
		{
			System.out.println(year +"������");
		}
		else if(year %4==0 && year %100!=0)
		{
			System.out.println(year +"������");
		}
		else
		{
			System.out.println(year +"��������");
		}
	}

}
