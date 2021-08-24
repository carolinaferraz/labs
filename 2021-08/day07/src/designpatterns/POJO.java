/*  plain old java object  */
package designpatterns;

//	serviceable class 
public class POJO {
	
	public String name;
	@SuppressWarnings("unused")
	private int id;
	protected double amount;
	
	public void printInfo() {
		System.out.println("name is: " + name +
				" amount is " + amount);
	}
}
