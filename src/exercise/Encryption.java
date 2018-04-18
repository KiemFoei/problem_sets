package exercise;

import java.util.Scanner;

//	输入字符的加密和解密
public class Encryption {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一段字符串");
		String s = sc.nextLine();
		char[] c = s.toCharArray();
		for(int i=0;i<c.length;i++){
			c[i]=(char) (c[i]^20000);
		}
		System.out.println("加密结果：");
		System.err.println(new String(c));
	}
}
