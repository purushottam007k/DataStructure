package staticstk;

public class Stack {
	int data[];
	int top;

	public Stack(int size) {
		data = new int[size];
		top = -1;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public void push(int v) {
		
		if(isFull()) {
			System.out.println("Stack is Full/ Stack Overflow");
			return;
		}
		data[++top]=v;
		
	}

	public void display() {
		if(isEmpty()) {
			System.out.println("Stack is Empty/ Underflow");
		return;
	}
		System.out.println("Stack Elements");
			for(int i=top;i>=0;i--)
				System.out.println(data[i]);
	}

	public boolean isFull() {
		if(top==data.length-1)
			return true;
		return false;

	}
	

	public boolean isEmpty() {
		if(top==-1)
			return true;
		return false;


	}

	public int pop() {

		if(isEmpty()) {
			System.out.println("Stack is Empty/ Underflow");
			return -1;
		}
			return data[top--];	
				//return 0;
	}
	public int peak() {

		if(isEmpty()) {
			System.out.println("Stack is Empty/ Underflow");
			return -1;
		}
			return data[top];	
				//return 0;
	}

}
