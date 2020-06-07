//8958
import java.util.Scanner;



public class Main13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		String ox[]=new String[l];
		int s[]=new int[l];
		
		for(int i=0; i<l ; i++) {
			ox[i]=sc.next();	
		}
		int count =0;
		for(int i=0; i<l ;i++) {
			count=0;
			for(int j=0; j<ox[i].length(); j++) {
				if(ox[i].charAt(j)=='O') {
					count++;
					s[i]+=count;
				}
				else
					count=0;
			}
			
		}
		
		for(int n:s) {
			System.out.println(n);
		}
		sc.close();
		
		
		
	}

}
