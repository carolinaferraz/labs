//	pro lab ArrList
//	model of a generic Item : :  it'll interact w/ ArrListSim.java 

package arraylist;

public class Item {
	private int id;
	private String description;
	
	public Item() {}
	
	public Item(int id, String description) {
		super();
		this.id = id;
		this.description = description;
	}

//	getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", description=" + description + "]";
	}	
}
