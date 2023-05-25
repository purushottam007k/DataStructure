package dcll;


public class DLL {
	Node head, tail;

	
	
	public DLL() {
		head= tail=null;	
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public boolean insertAtBeg(String s) {
				
		Node nn=new Node(s);
		if(nn==null)
			return false;
		if(head==null) {
			head=tail=nn;
			head.setNext(nn);
			head.setPrev(nn);
		}
		else {
			nn.setNext(head);
			nn.setPrev(tail);
			head.setPrev(nn);
			tail.setNext(nn);
			head=nn;
		}
		
		return true;
		
	}
	
	
	
	
	public void forwordDisplay() {
		Node temp = head;
		System.out.print("\nForword List Elements  -");
		while (temp.getNext() != head) {
			//System.out.println(temp.getData()+"\n");
			System.out.print("\t"+temp.getData());
			temp = temp.getNext();
		}
		System.out.print("\t"+temp.getData()+"\n");
	}

	public void backwordDisplay() {
		Node temp = tail;
		System.out.print("\nBackword List Elements  -");
		while (temp.getPrev() != tail) {
			//System.out.println(temp.getData()+"\n");
			System.out.print("\t"+temp.getData());
			temp = temp.getPrev();
		}
		System.out.print("\t"+temp.getData()+"\n");
	}
	
	public void checkCircularity(int n) {
		Node temp=head;
		int i=1;
		System.out.print("\nForward Circularity  -");
		while(i<=n)
		{
			System.out.print("\t" + temp.getData());
			temp = temp.getNext();
			i++;
		}
		
	}

	public boolean deleteAtPos(int p) {
		if(p<=0)
		{
			System.out.println("\nPlease Enter Valid +ve Position");
			return false;
		}
		if(p==1)
		{
			deleteAtBeg();
			return true;
		}
		Node temp=head;
		int i=1;
		while(i<p-1) {
			i++;
			temp=temp.getNext();
			if(temp.getNext()==head)
			{
				System.out.println("\nInvalid Position");
				return false;
			}
		}
		Node t=temp.getNext();
		
		temp.setNext(t.getNext());
		t.getNext().setPrev(temp);;
		
		if(t.getNext()==head)
			tail=temp;
		t.setNext(null);
		t.setPrev(null);
		
		return true;
	}

	private boolean deleteAtBeg() {
		
		if(head==null)
		{
			System.out.println("\nList Empty");
			return false;
		}
		
		Node t=head.getNext();
		t.setPrev(tail);
		tail.setNext(t);
		head.setNext(null);;
		head.setPrev(null);
		head=t;
		
		
		return true;		
	}
	

}
