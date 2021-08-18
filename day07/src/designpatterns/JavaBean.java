package designpatterns;

/*
 * more formal pojo.  provides more restrictions
 * to the creation of this class. 
 * jb should provide a no-args constructor
 * jb should declare all fields (vars) private
 * jb should declare a getter/setter for each field
 * jb should override the
 * 		toString, hashcode, and equal methods
 * jb typically has a parameterized constructor
 * jb typically will implement the "serializable" 
 */

public class JavaBean {
	private String name;
	private int id;
	private double amount;
	
	public JavaBean() {
		
	}
	
	public JavaBean(String name, int id, double amount) {
		this.name = name;
		this.id = id;
		this.amount = amount;
	}
	
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setName(String name) {
		this.name = name;
	}
 }
