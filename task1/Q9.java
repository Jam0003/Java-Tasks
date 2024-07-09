package task1;

import java.util.Scanner;
public class Q9 {

	public static void main (String [] args) 
	{
		
    Scanner myscanner = new Scanner(System.in);
    
    System.out.println("enter the value of a");
    
    int a = myscanner.nextInt();

     if (a>=65)
    {
        System.out.println("The person is senoir citizen");  
    }
     
    else
    {    
        System.out.println("The person is not a senoir citizen");
    }

}

}

