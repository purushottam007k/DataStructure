package circular;

public class Circular {
	Node head;
	Node tail;
	Circular()
	{
		this.head=null;
		this.tail=null;
	}
	void InsertAtfirst(int a)
	{
		
		Node nn = new Node(a);
		if(head==null)
		{
			head=nn;
			tail=nn;
			
		}
		else
		{
			nn.next=head;
			head=nn;
			tail.next=head;
		}
		
		
	}
	void InsertAtlast(int a)
	{
		Node nn=new Node(a);
		if(head==null)
		{
			head=nn;
			tail=nn;
		}
		else
		{
			Node temp=tail;
			temp.next=nn;
			tail=nn;
			nn.next=head;
		}
	}
	void InsertAtposition(int a,int b)
	{
		Node nn= new Node(a);
		Node temp =head;
		Node ptr=temp.next;
		for(int i=1;i<b-1;i++)
		{
			temp=ptr;
			ptr=ptr.next;
		}
		nn.next=ptr;
		temp.next=nn;
		
	}
	void DeleteAtfirst()
	{  Node temp=head;
		head=temp.next;
	}
	void DleteAtlast()
	{
		Node temp=head;
		Node ptr=temp.next;
		do {
			temp=ptr;
			ptr=ptr.next;
		}while(ptr.next!=head);
		temp.next=head;
		
	}
	void Display()
	{
		Node temp=head;
		do
		{
			System.out.println(temp.data);
			temp=temp.next;
		}while(temp!=head);
		
	}

	public static void main(String[] args) {
      Circular l = new Circular();
      l.InsertAtfirst(5);
      l.InsertAtfirst(6);
      l.InsertAtfirst(8);
      l.InsertAtfirst(7);
//      //l.InsertAtlast(85);
//      l.InsertAtlast(95);
      l.InsertAtposition(8888,3);
//     l. DeleteAtfirst();
//    l. DleteAtlast();
      
      l.Display();
	}

}
