package com.neuedu.test.chapter0;

public class switch�����ϰ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 22;
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:{
			System.out.println("31��");
			break;
		}
		case 4:
		case 6:
		case 9:
		case 11:{
			System.out.println("30��");
			break;
		}
		case 2:{
			System.out.println("28��");
			break;
		}
		default:
			System.out.println("���벻�Ϸ�");
			break;
		}

	}

}
