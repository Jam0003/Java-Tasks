package task8;

import java.util.Scanner;

public class Q5 {
	
	//Prime numbers only divisible by 1 and itself. If you divide a prime number by a number other than 1 and itself,
    //you will get a non-zero remainder.

	public static void main(String[] args) {
		
		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Enter the value");
		
		int a = myscanner.nextInt();
		int count = 0;
		
		for(int i=1; i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}

		if(count == 2)
		{
			System.out.println(a+ "is a prime number");
			
		}
		
		  else{
		         System.out.println(a+" is not a prime number");
		         }
	}
}
