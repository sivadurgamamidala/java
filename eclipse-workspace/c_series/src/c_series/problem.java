package c_series;

import java.util.Scanner;

public class problem {

	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		System.out.println("Enter the value of n  : ");
		int n=x.nextInt();
		int n1=-2, n2=1, n3=2, sum;
		sum=n1+n2+n3;
		for(int i=0;i<=n;i++) {
			
			System.out.println(sum+"\t");
			n1=n2;
			n2=n3;
			n3=sum;
			sum=n1+n2+n3;
			
		}

	}

}