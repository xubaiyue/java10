package com.neuedu.test.chapter3;

public class Test29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=56789;
		for(int i=1;;i++){
			n=n/10;
			if(n==0)
			{	
				System.out.println(i);
				break;
			}
		}
	}

}
