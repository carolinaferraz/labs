package designpatterns;

/* 
 * plain old java object ! 
 */
public class POJO {
	public String name;
	private int id;
	protected double amount;
	
	public void printInfo() {
		System.out.println("name is: " + name +" amount is " + amount);
	}
}
