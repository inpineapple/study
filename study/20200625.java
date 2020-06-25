//2675

import java.util.Scanner;

public class Main17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] count = new int[n];
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			count[i] = sc.nextInt();
			str[i] = sc.next();
		}
		sc.close();

		for (int k = 0; k < str.length; k++) {
			for (int i = 0; i < str[k].length(); i++) {
				for (int j = 0; j < count[k]; j++) {

					System.out.print(str[k].charAt(i));
				}
			}
			System.out.println();

		}
	}

}
