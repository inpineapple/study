//1110더하기 사이클 
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int temp=number;
		int a=0;
		int b=0;
		int result=0;
		int i=0;
		while(true) {
			a=temp/10;
			b=temp%10;
			result=a+b;
			temp=b*10+result%10;
			i++;
			if(number==temp)
				break;
		}
		System.out.println(i);
	}

}
