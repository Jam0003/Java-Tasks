package task9;

import java.util.Scanner;

public class Q2ReverseTheGivenString {

	public static void main(String[] args) {
		// Reverse the given string
		
	System.out.println("Enter the string");
	
	Scanner sc = new Scanner(System.in);
	
	String input = sc.nextLine();
	
	for(int i = input.length()-1 ; i>=0; i--)
		
	{
		System.out.print(input.charAt(i));
	}
		

	}

}
