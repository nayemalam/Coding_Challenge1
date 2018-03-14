/*
 *   NAME      : NAYEM ALAM
 *   EMAIL     : nayem.alam@mail.mcgill.ca
 *   
 *   Using Java; the following program receives a positive integer from the command line as an argument
 *   and calculates the sum of the integer values smaller than the input argument
 *   that only contain 0s and 1s.
 *   
 */

import java.util.Scanner;

public class SumOf1sand0s {
	
	public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	
	//Allow user to type in from console or command line
	System.out.print("Input argument is: ");
	int input = Integer.parseInt(reader.nextLine());
	
	//Making sure the input is positive, if not, it will prompt user to input a positive number
	if(input >= 0) {
		Combinations(Integer.toString(input));	
	}else {
		System.out.println("Please enter a positive number.");
	}
	
	} // End main
	
	public static void Combinations(String a) { //Method created to calculate the 1s and 0s, passing a String as an argument
		
		//Find the length of any given number (i.e. length of 767 should be 3)
		int b = 0;
		int result = 0;
		for(int i = 0; i<a.length(); i++) {
			b = (int) (Math.pow(2, a.length())-1);
		}
		
		//Calculate the sum of the combination of numbers
		for(int i = 0; i<=b;i++) {
			result += toBinary(i);
		}
		System.out.println("Sum: " + result);
	}
	
	//Convert decimal to binary (i.e. Decimal number is the argument, n, in the method)
	public static int toBinary(int n) {
        int r; //remainder
        int val = 0;
        String str = "";
      
        //Decimal number should be greater than 0 (not consider 1s or 2s complements)
        while(n > 0) {
            r = n % 2; 
            str = str + "" + r;
            n = n / 2; //iterate n to n/2 because that is the conventional way for decimal to binary
        }
        //Need to reverse the order in which the 1s and 0s are found to get actual binary representation
        for(int i=0; i <reverseString(str).length(); i++) {
         	val = Integer.parseInt(reverseString(str));
         
        }
		return val;
	}
	
	//Method created to reverse a given string
	public static String reverseString(String s) {
		StringBuilder sb = new StringBuilder(); 
	
		for(int i = s.length()-1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}

}

