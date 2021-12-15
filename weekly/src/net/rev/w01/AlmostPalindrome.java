/*
 * A string is an almost-palindrome if, by changing only one character, you can make it a palindrome. 
 * Create a function that returns true if a string is an almost-palindrome and false otherwise.
 */
package net.rev.w01;

public class AlmostPalindrome {

	public static void main(String[] args) {
	     
	    String str = "abccia";
	         
	    if (aP(str))	     
	        System.out.println("true");
	    else
	        System.out.println("false");
	         
	    }
	
	public static boolean aP(String str) {

//		calculate length of string and initialize counter
		int length = str.length();    
	    int count = 0; 
	    
//	    split string in half and iterate/match each half
	    for (int i = 0; i < length/2; ++i)     
	        if (str.charAt(i) != str.charAt(length - i - 1))
	            ++count;
	    
	    return (count <= 1);
	    }
}
