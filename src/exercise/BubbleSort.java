package exercise;
//	ц╟ещеепР
public class BubbleSort {
	public static void main(String[] args) {
		int[] report={20,66,90,88,87,76,98,79,100,59};
		for(int i=0;i<report.length;i++){
			for(int j=0;j<report.length-1;j++){
				if(report[j]<report[j+1]){
					report[j]=report[j]+report[j+1];
					report[j+1]=report[j]-report[j+1];
					report[j]=report[j]-report[j+1];
				}
			}
		}
		for(int a:report){
			System.out.print(a+" ");
		}
	}
}
