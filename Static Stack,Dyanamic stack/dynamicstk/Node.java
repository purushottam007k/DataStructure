package dynamicstk;

public class Node {
	private int data;
	private Node prev;
	
	public Node(int data) {
		this.data = data;
		this.prev=null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getPrev() {
		return prev;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
		

}
