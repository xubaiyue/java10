package com.neuedu.test.chapter3;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.�����Ժ�ı�Ϣ�ϼ�
		double sum = 1000000;
		for(int i=0;i<3;i++)
		{
			sum=sum*(1+0.04);
		}
		
		//2.���·�Ǯ
		double month_money = (sum - 1000000)/36;
		System.out.println(month_money);
		
		
		//3.һ���ȡ��
		double sum2 = 1000000*(1+0.003);
		double refund = sum2 - month_money*12;
		System.out.println(refund);

	}

}
