package com.neuedu.test.chapter;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * \r回到行首
		 * \n换行
		 * 
		 * 在eclipse工具中,测试不出来
		 * 
		 * 0-9：十进制48
		 * A-Z：十进制65
		 * a-z：十进制97
		 * （可百度搜索 ascii码）
		 * 
		 * */
		char a = 'a';
		char b = '中';
		char c = '\u9FA5';
		char d = '\t';
		char e = '\'';
		char f = '\\';
		String g = "\"";
		
		System.out.print(a);
		System.out.print(b);
		System.out.print('\b');
		System.out.print(d);
		System.out.print(c);
		System.out.print('\n');
		System.out.print(e);
		System.out.print(f);
		System.out.println(g);
		
		System.out.println("escape\\bchar");
	    System.out.println("escape\\tchar");
	    System.out.println("escape\\rchar");
	    System.out.println("escape\\nchar");
	    System.out.println("\\我在斜线里\\");
	    System.out.println("\'我在单引号里\'");
	    System.out.println("\"我在双引号里\"");
	    System.out.println("我没有双引号");
	    
	    boolean flag = true;
	    boolean flag2 = false;

	}

}
