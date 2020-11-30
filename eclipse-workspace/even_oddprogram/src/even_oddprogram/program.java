package even_oddprogram;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=scan.nextInt();
		if(num%2==0) {
			System.out.println(num + " is EVEN number");
		}
		else {
			System.out.println(num + " is ODD number");
		}
	}

}
