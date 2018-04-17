package exercise;
//	两个变量值得互换
public class ExChangeValue {
	public static void main(String[] args) {
		int i=1;
		int j=2;
		int result;
		System.out.println("交换之前i="+i+" ，交换之前j="+j);
		result=i;
		i=j;
		j=result;
		System.out.println("交换之后i="+i+" ，交换之后j="+j);
		System.out.println("------------------------------------------");
		int a=1;
		int b=2;
		System.out.println("交换之前a="+a+" ，交换之前b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("交换之后a="+a+" ，交换之后b="+b);
	}
}
