// tiny pro lab: Writing Your Own Classes

package classes;

public class Ball {
	String size;
    String color;
	
	public static void main(String[] args) {
	Ball b1 = new Ball();
	Ball b2 = new Ball();
	
//	initial state of the 2 instances
	b1.size = "big";
    b1.color = "red";
    b2.size = "small";
    b2.color = "blue";
	}
}
