package com.neuedu.test.chapter3;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2000;
		int month = 6;
		
		//1,3,5,7,8,10,12  -> 31
		//4,6,9,11 ->30
		//2
		switch(month)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31��");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30��");
			break;
		case 2:
			if(year %400 ==0)
			{
				System.out.println(year +"������");
			}
			else if(year %4==0 && year %100!=0)
			{
				System.out.println(year +"������");
			}
			else
			{
				System.out.println(year +"��������");
			}
			{
			System.out.println("28��");
		}
			break;
			default:
				System.out.println("���벻�Ϸ�");
				break;	
		}

	}

}
