package task9;

import java.util.Scanner;

public class Q7CalculateLargestNumberAmong3Numbers {

	public static void main(String[] args) {
		
		 //Calculate the largest number among the three numbers

        Scanner myscanner = new Scanner(System.in);
        System.out.println("enter the values of a,b,c");
        int a = myscanner.nextInt();
        int b = myscanner.nextInt();
        int c = myscanner.nextInt();
        myscanner.close();

        if(a>b && a>c){
            System.out.println("a is the greatest number" );
        }
        else if (b>c){
            System.out.println("b is the greatest number");
        }
        else
        {
            System.out.println("c is the greatest number");
        }
        // using ternary operator
        // System.out.println(a>b && a>c ? "a " : b>c ? "b" : "c" + "is the greatest number");

	}

}
