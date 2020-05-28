//2884알람시계
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int m=sc.nextInt();
		
		if (h==0 && m<45) {
			h=24-1;
			m=m+60-45;
		}
		else if (h==0 && m >=45) {
			m-=45;
		}
		else if (h>0 && m >=45){
			m-=45;
		}
		else if(h>0 && m<45) {
			h-=1;
			m=m+60-45;
		}
			
		System.out.print(h+" "+m);
	}

}
