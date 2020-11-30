package b_series;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x= new Scanner(System.in);
		System.out.println("Enter the value of n  : ");
		int n=x.nextInt();
		int n1=0,n2=1,sum;
		sum=n1+n2;
		for(int i=0; i<=n; i++) {
			System.out.println(sum);
			sum=n1+n2;
			n1=n2;
			n2=sum;
			
		}
	}

}
