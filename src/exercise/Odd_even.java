package exercise;

import java.util.Scanner;

//	�ж�������ż��
public class Odd_even {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		int i = sc.nextInt();
		if(i%2==0){
			System.out.println("�����������"+i+"��ż��");
		}else{
			System.out.println("�����������"+i+"������");
		}
	}
}
