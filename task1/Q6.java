package task1;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		
	
		        Scanner myscanner = new Scanner(System.in);
		        
		        System.out.println("enter the value of a");
		        
		        int a = myscanner.nextInt();
		        int b=1;
		        
		        for(int i=a ;i >= 1; i--){
		        b=b*i;
		        System.out.println(b);
		        }
		        System.out.println("the factorial of the given number is " +b);

		    }



		

}
