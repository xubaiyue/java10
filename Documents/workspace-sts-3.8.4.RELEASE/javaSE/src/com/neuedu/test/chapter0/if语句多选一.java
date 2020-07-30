package com.neuedu.test.chapter0;

public class if语句多选一 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2001;
		if(i%4==0 && i%100!=0){
			System.out.println(i+"是闰年");
		}
		else if(i%400==0){
			System.out.println(i+"是闰年");
		}
		else {
			System.out.println(i+"不是闰年");
		}

	}

}
