package com.neuedu.test.chapter;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��֪a,b�������ͱ�����д����a,b���������е�ֵ�����ĳ���
		int a=10,b=20;
		int c=30;
		c=b; //c=20
		b=a;//b=10
		a=c;//a=20
		System.out.println("a="+a+",b="+b);
	
		//����һ��0��1000�����������λ���ĺͣ�����345�Ľ����3+4+5��12ע���ֽ����ּȿ����ȳ���ģҲ������ģ�����
		int d = 525;
		
		//�ȳ���ģ a/λ%10
		int qianwei = 525/1000;
		int baiwei = 525/100%10;
		int shiwei = 525/10%10;
		int gewei = 525%10;
		
		int sum = qianwei + baiwei +shiwei +gewei;
		System.out.println("��λ���ĺ���" + sum);

		//�����¶Ⱥ������¶Ȼ���ת�����ӻ��϶ȱ�����϶���ֻҪ��ȥ32������5�ٳ���9�����ˣ������϶�ת�ɻ��϶ȣ�ֱ�ӳ���9������5���ټ���32���С�
        double s= 32.3;
        double h = s * 9/5 +32;
        System.out.println(h);
        double h2 = 100;
        double s1 = (h2-32) * 5/9;
        System.out.println(s1);
        System.out.println(0.1*0.1);
		//����һ������Ĵ�д��ĸA~Z��ת��ΪСд��ĸ��
        char x ='A';
        char x2 = (char)(x +32);
        
        System.out.println(x2);
		
	}

}

















