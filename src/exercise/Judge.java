package exercise;

import java.util.Scanner;

//	判断某一年是否为闰年
public class Judge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入想要查询的年份");
		try{
			int year = sc.nextInt();
			if(year%4==0 && year%100!=0 || year%400==0){
				System.out.println(year+"年是闰年");
			}else{
				System.out.println(year+"年不是闰年");
			}
		}catch(Exception e){
			System.out.println("您输入的不是有效的年份");
		}
	}
}
