package dcll;

 public class Node {
	
	String data;
	Node next,prev;
		
	public Node(String data) {
		this.data = data;
		next=prev=null;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node getPrev() {
		return prev;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}

}
