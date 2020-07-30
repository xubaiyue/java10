package com.neuedu.test.chapter;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//已知a,b均是整型变量，写出将a,b两个变量中的值互换的程序。
		int a=10,b=20;
		int c=30;
		c=b; //c=20
		b=a;//b=10
		a=c;//a=20
		System.out.println("a="+a+",b="+b);
	
		//给定一个0～1000的整数，求各位数的和，例如345的结果是3+4+5＝12注：分解数字既可以先除后模也可以先模后除。
		int d = 525;
		
		//先除后模 a/位%10
		int qianwei = 525/1000;
		int baiwei = 525/100%10;
		int shiwei = 525/10%10;
		int gewei = 525%10;
		
		int sum = qianwei + baiwei +shiwei +gewei;
		System.out.println("各位数的和是" + sum);

		//华氏温度和摄氏温度互相转换，从华氏度变成摄氏度你只要减去32，乘以5再除以9就行了，将摄氏度转成华氏度，直接乘以9，除以5，再加上32即行。
        double s= 32.3;
        double h = s * 9/5 +32;
        System.out.println(h);
        double h2 = 100;
        double s1 = (h2-32) * 5/9;
        System.out.println(s1);
        System.out.println(0.1*0.1);
		//给定一个任意的大写字母A~Z，转换为小写字母。
        char x ='A';
        char x2 = (char)(x +32);
        
        System.out.println(x2);
		
	}

}

















