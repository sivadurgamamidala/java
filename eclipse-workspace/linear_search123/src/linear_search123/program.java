package linear_search123;

import java.util.Arrays;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		int i=0, element;
		Scanner store = new Scanner(System.in);
		System.out.print("enter the no of element to store in array : ");
		element=store.nextInt();
		int[] arr = new int[element];
		
		for (i = 0; i < element; i++) {
		    System.out.print("Enter a number "+i+" : ");
		   
		    arr[i] = store.nextInt();
		}
		System.out.print("Displaying the numbers: ");
		for(int j=0; j<arr.length; j++) {
			
			System.out.print(arr[j]+"\t");
			
		}
		int searchElement;
		System.out.print("\n");
		System.out.println("enter the number to search: ");
		searchElement =store.nextInt();
		int position = -1;
		for(int j=0; j<arr.length; j++) {
			if(arr[j]==searchElement) {
			position = ++j;
			break;
			}
			}
		if (position != -1)
		{
			System.out.print(searchElement +" is found at position "+ position);
		}
		else {System.out.print("Not found");}
		}	
	}


