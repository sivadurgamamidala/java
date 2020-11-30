package linear_search;

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
		for(int j=0; j<element; j++) {
			
			System.out.print(arr[j]+"\t");
			
		}
		Arrays.sort(arr);
		//System.out.print(arr+"\t");
		int first, middle, last , linear;
		System.out.print("\n");
		System.out.println("enter the numbers to search: ");
		linear =store.nextInt();
		first=0;
		last=element;
		middle=(first+last)/2;
		while(first<=last) {
			if(arr[middle]<linear) {
				first=middle+1;
			}
			else if(arr[middle]==linear) {
				System.out.print("number you enter is found : "+ linear);
				break;
			}
			else
			{
				last=middle-1;
			}
			middle=(first+last)/2;
		} 
		if(first>last) {
			System.out.print(linear+" number not found");
		}
	}

}
