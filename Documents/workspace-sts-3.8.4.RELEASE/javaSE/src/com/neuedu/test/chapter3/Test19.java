package com.neuedu.test.chapter3;

public class Test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ж�һ�����ǲ�������
		int n=2;
		int i=2;
		for(;i<=n-1;i++)
		{
			if(n%i==0)
			{
				//������
				System.out.println("��������");
				break;
			}
		}
		if(i==n)//һ����û����
		{
			System.out.println("������");
		}
		
	}

}
