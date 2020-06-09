//4344
import java.util.Scanner;



public class Main14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int ss[][]=new int[l][];
		for(int i=0; i<l; i++) {
			int sn=sc.nextInt();
			ss[i]=new int[sn];
			for(int j=0; j<sn; j++) {
				ss[i][j]=sc.nextInt();
			}
		}
		sc.close();
		
		float avg[]=new float[l];
		
		for(int i=0; i<l; i++) {
			for(int j=0; j<ss[i].length; j++) {
				avg[i]+=ss[i][j];
			}
				
		}
		for(int i=0; i<l; i++) {
			avg[i]/=ss[i].length;
		}
		
		float c;
		float result[]=new float[l];
		for(int i=0; i<l ; i++) {
			c=0;
			for(int j=0; j<ss[i].length; j++) {
				if(ss[i][j]>avg[i]) {
					c++;
				}
				
			}
			result[i]=c/ss[i].length*100;
		}
		
		for(float r: result)
			System.out.printf("%.3f%%\n",r);
		
	}

}
