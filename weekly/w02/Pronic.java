package net.rev.w02;

public class Pronic {

	public static void main(String[] args) {
		isHeteromecic(0);
		isHeteromecic(2);
		isHeteromecic(136);
		isHeteromecic(156);
	}
		
		static void isHeteromecic(int number) {
			int n = (int)Math.sqrt(number);
			
			if (number == (n * (n+1))) {
				System.out.println("true");
			} else {	
				System.out.println("false");
			}
		}
}
