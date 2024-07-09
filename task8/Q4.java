package task8;

import java.util.Scanner;

public class Q4 {
	
	public static void main (String [] arg)
	{
		
   Scanner myscanner = new Scanner(System.in);
   
   System.out.println("Enter the values of a and b");
   
   int a = myscanner.nextInt();
   int b =myscanner.nextInt();
   
   System.out.println("Before swapping the values: \n" + "a=" +a+ "\n" + "b=" + b + "\n");
   
   int z;
   
   z=a;
   a=b;
   b=z;
   
   System.out.println("After swapping the values: \n" + "a=" +a+ "\n" + "b=" + b);
   
   
		   
		
	}

}
