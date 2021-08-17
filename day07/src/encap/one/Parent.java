// lab on types of access
package encap.one;

public class Parent {
	
	public String pub = "public string";
	protected String pro = "protected string";
	String def = "default (package-private) string";
	private String pri = "private string";
	
	public void printStrings() {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(def);
		System.out.println(pri);
	}
	

}
