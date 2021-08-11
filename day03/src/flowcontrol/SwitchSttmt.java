package flowcontrol;

public class SwitchSttmt {
	public static void main(String[] args) {
		
		System.out.println((char) 9731); 
// numerical representation of a snowman ☃
		
		char letter = 'b';

		switch (letter) {
		case 'a':
			System.out.println("a for assembly!");
			break;
			
		case 'b':
			System.out.println("b for binary!");
			break;
			
		case 'c':
			System.out.println("c for compilation!");
			break;
			
			default:
				System.out.println("too many letters");
		}
	}
}