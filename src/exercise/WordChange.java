package exercise;

import java.util.Scanner;

//	常见的字母大小写转换
public class WordChange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要转换的字母");
		char c = sc.next().charAt(0);
		if(c>='a' && c<='z'){
			c-=32;
			System.out.println("这里的小写"+(char)(c+32)+"被转换成了大写"+c);
		}else if(c>='A'&&c<='z'){
			c+=32;
			System.out.println("这里的大写"+(char)(c-32)+"被转换成小写"+c);
		}
	}
}
