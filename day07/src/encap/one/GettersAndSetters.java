// a bank account model for getters/setters methods

package encap.one;

/* the typical convention for encap:
 * all the fields are private, and getters/setters are provided
 * w/ a certain level of access */

public class GettersAndSetters {
	private String name;
	private long id;
	private String acctType;
	private int SSN;
	private String pass;
	private double acctValue;
	
//	getter - used to access/read data
	
//	setter - used to mutate/change data
	
	public String getName() {
		return name;
	}
	
	protected void setName(String name) {
		this.name = name;
	}
	
	private String getPass() {
		return pass;
	}
	
	private void setPass(String pass) {
		this.pass =pass;
	}
	
	
}
