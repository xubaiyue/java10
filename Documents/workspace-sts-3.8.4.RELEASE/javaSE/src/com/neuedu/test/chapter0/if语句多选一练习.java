package com.neuedu.test.chapter0;

public class if����ѡһ��ϰ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//�ж�һ�������Ƿ��ܱ�5��6ͬʱ��������ӡ�ܱ�5��6����������ֻ�ܱ�5��������ӡ�ܱ�5����������ֻ�ܱ�6������
//����ӡ�ܱ�6�����������ܱ�5��6����������ӡ���ܱ�5��6������
		int n = 8;
				if(5%n==0 && 6%n==0){
					System.out.println(n +"�ܱ�5��6����");
				}
		else if(5%n==0){
			System.out.println(n +"�ܱ�5����");
		}
		else if(6%n==0){
			System.out.println(n +"�ܱ�6����");
		}
		else{
			System.out.println(n+"���ܱ�5��6����");
		}
	}

}
