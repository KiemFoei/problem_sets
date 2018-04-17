package exercise;

import java.util.Scanner;

//	判断数字奇偶性
public class Odd_even {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int i = sc.nextInt();
		if(i%2==0){
			System.out.println("您输入的数字"+i+"是偶数");
		}else{
			System.out.println("您输入的数字"+i+"是奇数");
		}
	}
}
