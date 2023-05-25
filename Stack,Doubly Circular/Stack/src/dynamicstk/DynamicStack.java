package dynamicstk;

public class DynamicStack {
	Node top;

	public DynamicStack() {
		this.top = null;
	}

	public void push(int v) {
		Node nn=new Node(v);
		
		if(isEmpty())
		{
			top=nn;
			return;
		}
		nn.setPrev(top);
		top=nn;		
	}

	public void display() {
		if(isEmpty())
		{
			System.out.println("Stack is Underflow");
			return;
		}
		System.out.println("Stack Elements : ");
		for(Node t=top;t!=null;t=t.getPrev())
			System.out.println(t.getData());
		
	}

	public void pop() {
		if(isEmpty())
		{
			System.out.println("Stack is Underflow");
			return;
		}
		Node t=top;
		System.out.println("Poped Element is : "+top.getData());
		top=top.getPrev();
		t.setPrev(null);
	}

	public void peak() {
		if(isEmpty())
		{
			System.out.println("Stack is Underflow");
			return;
		}
		System.out.println("Top Most Element is : "+top.getData());
			
	}
	
	public boolean isEmpty() {
		if(top==null)
			return true;
		return false;
	}
}
