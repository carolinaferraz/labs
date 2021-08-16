package main;

import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
	    	 Converter convert = new Converter();
	         convert.menuSelection();
	}
	
	public void menuSelection(){ 
		
		  System.out.print("Hello, I am a Converter. " );
		  System.out.println();
		  
//	     prompt user for input
	    System.out.print(" > Please enter distance (in feet): " );
	    System.out.println( );
	    
	    
//	    initialize scanner
	    Scanner scan = new Scanner(System.in);
	    
//	    create variables to store input and boolean to quit app 
	    double f = scan.nextDouble();
	    boolean quit = false;
	    
	          
//	    menu options descriptions
	    System.out.println("Choose option for output or to quit:  ");
	    System.out.println("1 - Inches");
	    System.out.println("2 - Meters");
	    System.out.println("3 - Centimeters");
	    System.out.println("4 - Quit");
	    System.out.println();
	    
	    
//	grab menu selection and attach it to a switch case
	    do {
	    		int menuSelection = scan.nextInt();
	    	
	    	switch (menuSelection){
	          case 1:
	        	  toInches(f);   
	          break;
	          case 2:
	        	  toMeters(f);
	          break;
	          case 3:
	        	  toCentimeters(f);
	          break;
	          case 4:
	          quit = true;
	          
	          System.out.println("End of converter. Bye!");
	          break;
	          
	          default:
	          System.out.println("Error. Try again!"); 
	          }
	      }
	      while (quit != true);
	    
//	    close resources 
	        scan.close();
	      }
	

//	conversion methods	
	public void toInches(double feet) {
	    	double inches = 12 * feet;
	    System.out.println(feet +" feet is = "+inches+" inches");
	    }
	
	public void toMeters(double feet) {
		double meters = feet * 0.3048;
		System.out.println(feet+" feet is = "+ meters + " meters");
		}
	   
	public void toCentimeters(double feet) {
	    double cm =30.48 * feet;
	    System.out.println(feet+" feet is = " + cm + "centimeters");
	    }

}
