package com.neuedu.test.chapter0;

public class switch语句3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//90-100优秀
		//80-89良好
		//70-79中等
		//60-69及格
		
		int score = 78;
		if(score<0 || score>100){
			System.out.println("输入不合法");
		}
		else{
		switch(score/10){
		case 10:
		case 9:
			System.out.println("优秀");
			break;
		case 8:
			System.out.println("良好");
			break;
		case 7:
			System.out.println("中等");
			break;
		case 6:
			System.out.println("及格");
			break;
			default:
				System.out.println("不及格");
		}
	    
	}

}
}
