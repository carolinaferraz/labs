// pro lab 'creating exceptions'

package com.example.exceptions;

@SuppressWarnings("serial")
public class EvenNumberException extends Exception {

	@Override
	public String toString() {
		return "you cannot input an even number.";
	}
	

}
