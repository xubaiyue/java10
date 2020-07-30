package com.neuedu.test.chapter0;

public class if语句二选一 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=33;
		if(n<=100 && n>=99){
			System.out.println("成绩为优秀");
		}
		else if(n>=80){
			System.out.println("成绩为良好");
		}
		else if(n>=70){
			System.out.println("成绩为中等");
		}
		else if(n>=60){
			System.out.println("成绩为及格");
		}
		else{
			System.out.println("成绩为不及格");
		}

	}

}
