package exercise;

import java.util.Scanner;

//	�ж�ĳһ���Ƿ�Ϊ����
public class Judge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ��ѯ�����");
		try{
			int year = sc.nextInt();
			if(year%4==0 && year%100!=0 || year%400==0){
				System.out.println(year+"��������");
			}else{
				System.out.println(year+"�겻������");
			}
		}catch(Exception e){
			System.out.println("������Ĳ�����Ч�����");
		}
	}
}
