package com.neuedu.test.chapter;

public class Test2 {

	public static void main(String[] args) {
		// �������������е�����
		//byte(1���ֽ�),short(2���ֽ�),int(4���ֽ�),long(8���ֽ�)
		
        //-128~127
		//�˴��и���ʽ����ת����
		byte a = 127;
		
		//-2^15 ~ 2^15-1
		short b =32767;
		
		//2147483647
		//-2^31 ~ 2^31-1
		int c = 2147483647;
		
		//-2^63 ~ 2^63-1
		//����long�����ݣ��������int��Χ���ں������L/l,�����ô�д
		long d0 = 123;
		//û������ת��
		long d = 2147483647123L;
	}

}
