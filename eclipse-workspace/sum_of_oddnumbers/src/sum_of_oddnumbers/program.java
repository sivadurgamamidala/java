package sum_of_oddnumbers;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner x= new Scanner(System.in);
		System.out.println("Enter the value of n  : ");
		int n=x.nextInt();
		for(int i=1; i<=n; i= i+2) 
		{
			sum= sum + i;
		}
		System.out.println(sum);
	}

}
