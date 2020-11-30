package swap_twonumbers;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x= new Scanner(System.in);
		System.out.println("Enter the num1 value : ");
		int num1=x.nextInt();
		System.out.println("Enter the num2 value : ");
		int num2=x.nextInt();
		System.out.println("Before swapping");
		System.out.println("Enter the num1 value : "+num1);
		System.out.println("Enter the num2 value : "+num2);
		
		
		int num3=num1;
		num1=num2;
		num2=num3;
		System.out.println("After swapping");
		System.out.println("Enter the num1 value : "+num1);
		System.out.println("Enter the num2 value : "+num2);
	}

}
