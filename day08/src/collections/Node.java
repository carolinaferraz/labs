package collections;

public class Node {
	
//	'data' is the info the node is holding onto
	private Integer data;
	
// 'next' is a reference to another node in the collection
	private Node next;
	
//	node constructor
	public Node(Integer data) {
		this.data = data;
	}

//	getters and setters 
	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
}
