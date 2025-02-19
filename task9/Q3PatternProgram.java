package task9;

import java.util.Scanner;

public class Q3PatternProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner myscanner = new Scanner(System.in);
        System.out.println("enter the values of a");
        int a = myscanner.nextInt();
        
        int x=1;

       
        for(int i=1;i<=a;i++){
           //System.out.println("first loop" + i +"<=" + 4 full loops);

        //    outerloop for rows

            for(int j=1;j<=i;j++){
                // inner loop for colomns


                System.out.print(x+" ");

                x++;

            }
    
        System.out.println("");

	}


}}