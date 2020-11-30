package num1_series;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x= new Scanner(System.in);
		System.out.println("Enter the value of n  : ");
		int n=x.nextInt();
		for(int i=1; i<=n; i++) {
			if(i%2==0) {
				System.out.println(i*i);
			}
		}
	}

}
