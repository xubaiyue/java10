package com.neuedu.test.chapter0;

public class if语句多选一练习 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//判断一个数字是否能被5和6同时整除（打印能被5和6整除），或只能被5整除（打印能被5整除），或只能被6整除，
//（打印能被6整除），不能被5或6整除，（打印不能被5或6整除）
		int n = 8;
				if(5%n==0 && 6%n==0){
					System.out.println(n +"能被5和6整除");
				}
		else if(5%n==0){
			System.out.println(n +"能被5整除");
		}
		else if(6%n==0){
			System.out.println(n +"能被6整除");
		}
		else{
			System.out.println(n+"不能被5或6整除");
		}
	}

}
