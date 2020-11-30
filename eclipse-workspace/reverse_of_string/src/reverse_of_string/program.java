package reverse_of_string;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		System.out.println("Enter the string : ");
		String siva=x.next();
		char[] rev = siva.toCharArray();	
		for (int i = rev.length-1; i>=0; i--) {
			System.out.print(rev[i]);
			
		}
        
	}

}
