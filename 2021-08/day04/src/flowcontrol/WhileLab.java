//	tiny pro lab

package flowcontrol;

public class WhileLab {
	public static void main (String[] args) {
		boolean on = true;
		
		while (on) {
			System.out.println("inside the while loop");
			
/* without either of the lines below, 
 * the loop would be infinite */
			
			break;
//			on = false;
		}
	}
}
