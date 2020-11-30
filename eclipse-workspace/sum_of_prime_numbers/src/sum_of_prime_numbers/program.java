package sum_of_prime_numbers;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		int n,m;
		
		Scanner x= new Scanner(System.in);
		System.out.print("Enter the n value : ");
		n=x.nextInt();
		
		System.out.print("Enter the m value : ");
		m=x.nextInt();
		for (int i=n;(i<=m);i++) {
			//divisible by 1 itself is a prime number
			//while(i==1 || i==2 || i==3) {
				if(!(i%2==0) || !(i%3==0)) {
					System.out.print(i+"\t");
				}
				
					
				//}
			
			}
			
		}
	}