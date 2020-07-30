package com.neuedu.test.chapter;

public class Test1 {

	public static void main(String[] args) {
		
		//声明变量
        int a;
        //赋值
        a=10;
        
        //声明变量，赋初值
        int b = 20;
        System.out.println(b);//b必须在赋值后才能使用
        b = 30;
        b = 50;
        System.out.println(b);
        //声明小数（double）
        double x = 12.34;
        double y = 15.6789d;
        
        //声明字符串类型
        String str = "haha";
        str = "hehe";
        System.out.println(x);
        System.out.println(str);
        
        //设置常量
        final double pi = 3.14;
	}

}
