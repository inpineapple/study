//3052
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Main11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int num[] =new int[10];
		int r[]=new int[10];
		for(int i=0; i<num.length; i++) {
			num[i]=sc.nextInt();
		}
		for(int i=0; i<num.length; i++) {
			r[i]=num[i]%42;
		}
		
		Map<Integer,Integer> result=new HashMap<>();
		
		for(int n:r) {
			result.put(n, n);
		}
		
		
		System.out.println(result.size());
		sc.close();
		
		
		
	}

}
