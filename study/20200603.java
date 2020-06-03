//5543상근날드

import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int min;
		if(a>b)
			min=b;
		else
			min=a;
		int c=sc.nextInt();
		if(min>c)
			min=c;
		
		int d=sc.nextInt();
		int e=sc.nextInt();
		
		if(d>e) {
			System.out.print(min+e-50);
		}
		else
			System.out.print(min+d-50);
		
	}

}
