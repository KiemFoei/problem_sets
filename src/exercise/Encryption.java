package exercise;

import java.util.Scanner;

//	�����ַ��ļ��ܺͽ���
public class Encryption {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String s = sc.nextLine();
		char[] c = s.toCharArray();
		for(int i=0;i<c.length;i++){
			c[i]=(char) (c[i]^20000);
		}
		System.out.println("���ܽ����");
		System.err.println(new String(c));
	}
}
