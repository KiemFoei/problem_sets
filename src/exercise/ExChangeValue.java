package exercise;
//	��������ֵ�û���
public class ExChangeValue {
	public static void main(String[] args) {
		int i=1;
		int j=2;
		int result;
		System.out.println("����֮ǰi="+i+" ������֮ǰj="+j);
		result=i;
		i=j;
		j=result;
		System.out.println("����֮��i="+i+" ������֮��j="+j);
		System.out.println("------------------------------------------");
		int a=1;
		int b=2;
		System.out.println("����֮ǰa="+a+" ������֮ǰb="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("����֮��a="+a+" ������֮��b="+b);
	}
}
