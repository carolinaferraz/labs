package com.example.exceptions;

import java.util.Scanner;

public class Sim {
	public static void main(String[] args) {
		getInput();
	}

//	get user input w/ scanner 
	public static void getInput() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("type a number and press Enter . . . ");
		String line = in.nextLine();
		System.out.println("you typed: " + line);
		
//		check is num is even, throw exception if true
		if(isEven(line)) {
			
			
			try {
				throw new EvenNumberException();
			} catch (EvenNumberException e) {
				e.printStackTrace();
			}finally {
				in.close();
			}
		}
		
//		close resources
		in.close();
	}
	
	public static boolean isEven(String num) {
//		convert value to a number
		int value = Integer.parseInt(num);
		
		return (value % 2==0);
	}
}
