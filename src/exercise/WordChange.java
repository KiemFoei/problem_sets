package exercise;

import java.util.Scanner;

//	��������ĸ��Сдת��
public class WordChange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫת������ĸ");
		char c = sc.next().charAt(0);
		if(c>='a' && c<='z'){
			c-=32;
			System.out.println("�����Сд"+(char)(c+32)+"��ת�����˴�д"+c);
		}else if(c>='A'&&c<='z'){
			c+=32;
			System.out.println("����Ĵ�д"+(char)(c-32)+"��ת����Сд"+c);
		}
	}
}
