package d_series;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		System.out.println("Enter the value of n  : ");
		int n=x.nextInt();
		int a=0;
		int b=0;
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(!(i%2==0)) {
			System.out.println(i+a);
			a++;
			}
			if(i%2==0) {
				System.out.println(-i-sum);
				sum=sum+2;
			}
		}

	}

}
