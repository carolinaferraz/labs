// a bank account model for getters/setters methods

package encap.one;

@SuppressWarnings("unused")
/* the typical convention for encapsulation:
 * all the fields are private, and getters/setters are provided
 * w/ a certain level of access */

public class GettersAndSetters {
	private String name;
	private long id;
	private String acctType;
	private int SSN;
	private String pass;
	private double acctValue;
	
	
// from menu > source > generate getter and setters 

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAcctType() {
		return acctType;
	}
	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}
	public int getSSN() {
		return SSN;
	}
	public void setSSN(int sSN) {
		SSN = sSN;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public double getAcctValue() {
		return acctValue;
	}
	public void setAcctValue(double acctValue) {
		this.acctValue = acctValue;
	}
	
//	getter - used to access/read data
//	setter - used to mutate/change data
	
	
	
	
}
