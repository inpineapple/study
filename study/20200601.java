//10996 별찍기

import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1; i<=2*n; i++) {
			for(int j=1; j<=n; j++) {
				if(i%2==1 && j%2==1) {
					System.out.print("* ");
				}
				else if(i%2==0 && j%2==0) {
					System.out.print(" *");
					
				}
				
			}
			System.out.println();
		}
	}

}
