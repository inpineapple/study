//2577
import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int abc=a*b*c;
		sc.close();
		
		int [] result=new int[10];
		
		int num=abc;
		for(int i=0; i<(int) (Math.log10(abc)+1); i++) {
			result[num%10]++;
			num=num/10;
		}
		for(int n :result)
			System.out.println(n);
		
	}

}
