package task9;

import java.util.Scanner;

public class Q1CheckTheGivenStringIsPalindrome {

	public static void main(String[] args) {
		
		// To check the given string is Palindrome or not
		
	System.out.println("Enter the values to check the given string in palindrome or not");
		
	Scanner sc = new Scanner(System.in);
	
	String input = sc.nextLine();
	
	String reverse ="";
	
	for( int i = input.length()-1 ; i>=0; i--)
	{
		reverse = reverse + input.charAt(i);
	}
	
	if(reverse.equalsIgnoreCase(input))
	{
		System.out.println("The given string is Palindrome");
	}

	else
	{
		System.out.println("The given string is not Palindrome");
	}
	
}
}