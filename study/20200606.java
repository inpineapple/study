//1546


import java.util.Arrays;
import java.util.Scanner;



public class Main12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int l=sc.nextInt();
		float s[]=new float[l];
		for(int i=0; i<s.length; i++) {
			s[i]=sc.nextInt();
		}
		Arrays.sort(s);
		
		int sl=s.length;
		for(int i=0; i<sl; i++) {
			s[i]=s[i]/s[sl-1]*100;
		}
		float avg=0;
		for(float i:s) {
			avg+=i;
		}
		avg/=sl;
		
		System.out.println(avg);
		sc.close();
		
		
		
	}

}
