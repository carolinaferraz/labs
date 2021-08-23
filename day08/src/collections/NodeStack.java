package collections;

public class NodeStack {
//	reference to last node added to the stack
	private Node top;
	
//	push method adds a node to the top of the stack
	public void push (int element) {
		Node node = new Node (element);
		push(node);
	}
	
//	overloaded push method
	public void push(Node node) {
		node.setNext(top);
		
//		'top' replaced by new node being added (last in comes 1st)
		this.top = node;
	}
	
//	pop method removes top node and returns it
	public Node pop() {
		Node poppedNode = top;
		top = top.getNext();
		poppedNode.setNext(null);
		return poppedNode;
	}

//	peek method returns current 'top' node
	public Node peek() {
		return top;
	}
}

