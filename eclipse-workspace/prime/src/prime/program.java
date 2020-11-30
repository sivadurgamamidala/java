package prime;

import java.util.Scanner;

public class program {

	public static int main(String[] args) {
		// TODO Auto-generated method stub
		int num,i,count,sum=0,n,m;
		Scanner x= new Scanner(System.in);
		System.out.print("Enter the n value : ");
		n=x.nextInt();
		
		System.out.print("Enter the m value : ");
		m=x.nextInt();
		 for(num = 1;num<=100;num++){
		  count = 0;
		 for(i=2;i<=num/2;i++){
		 if(num%i==0){
		  count++;
		 break;
		  }
		  }
		 if(count==0 && num!= 1)
		  sum = sum + num;
		  }
		  printf("Sum of prime numbers is: %d ",sum);
		 return 0;
	}

}
