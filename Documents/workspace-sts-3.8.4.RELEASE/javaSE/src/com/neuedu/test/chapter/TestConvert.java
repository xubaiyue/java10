package com.neuedu.test.chapter;

public class TestConvert {
	  public static void main(String arg[]) {
		    /*�Զ�����ת��*/
		    int i1 = 12;
		    int i2 = 45;
		    double d1 = (i1 + i2) * 1.0;//ϵͳ��ת��Ϊdouble������
		    System.out.println(d1);
		    /*�Զ�����ת��*/
		    float f3 = 12.3f;//�����f
		    long l1 = 12300;
		    long l2 = 300000000000L;//�����l
		    float f = l1 + l2 + f3;//ϵͳ��ת��Ϊfloat�ͼ���
		    System.out.println(f);
		    String s;
		    byte m1=1;
		    byte m2=3;
		    byte m = (byte)(m1+m2);
		    /*ǿ������ת��*/
		    long l = (long)f;//ǿ��ת������ȥС�����֣������������룩
		    System.out.println(l);
		    /*ǿ������ת��*/
		    byte b1 = 67;
		    byte b2 = 89;
		    byte b3 = (byte)(b1 + b2);//ϵͳ��ת��Ϊint�����㣬��Ҫǿ��ת����
		    System.out.println(b3);
		    
		    char a = 'a';
		    char b = 'b';
		    
		    //��ʽ��ת��
		    int c = a+b; //97+98
		   
		  }
		}
