package designpatterns;

//class w/ all fields private
public class JavaBean {
	private String name;
	private int id;
	private double amount;
	
//	no-args constructor 
	public JavaBean() {
	}
	
	public JavaBean(String name, int id, double amount) {
		this.name = name;
		this.id = id;
		this.amount = amount;
	}

//	getters && setters for each field
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

//	override the toString 
	@Override
	public String toString() {
		return "JavaBean [name=" + name + ", id=" + id + ", amount=" + amount + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
 }