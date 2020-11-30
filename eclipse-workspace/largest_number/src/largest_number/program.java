package largest_number;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int first=x.nextInt();
		System.out.println("Enter the number : ");
		int second=x.nextInt();
		System.out.println("Enter the number : ");
		int third=x.nextInt();
		if(first>second && first>third) {
			System.out.println("first largest number is "+first);
			if(second>third) 
			{
				System.out.println("second largest number is "+second);
			}
			else 
			{
				System.out.println("second largest number is "+third);
			}
			
		}
		else if(second>first && second>third)
		{
			System.out.println("first largest number is "+second);
			if(first>third) 
			{
				System.out.println("second largest number is "+first);
			}
			else 
			{
				System.out.println("second largest number is "+third);
			}
		}
		else
		{
			System.out.println("first largest number is "+third);
			if(first>second) 
			{
				System.out.println("second largest number is "+first);
			}
			else 
			{
				System.out.println("second largest number is "+second);
			}
		}
	}

}
