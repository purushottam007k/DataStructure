import java.util.Scanner;

public class DLinked {
	static Node head;
	static Node tail;
	DLinked()
	{
		this.head=null;
		this.tail=null;
	}
	static void creation(int a)
	{
		Node nn=new Node(a);
		if(head==null)
		{
			head=nn;
			tail=nn;
		}
		else
		{
			head.prev=nn;
			nn.next=head;
			head=nn;
		}
	}
	static void Insertatlast(int a)
	{
		Node nn=new Node(a);
		if(head==null)
		{
			head=nn;
			tail=nn;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=nn;
			//nn.prev=temp;
			//tail.prev=nn.next;
		}
		//System.out.println(tail.prev.data+"aks");
		
	}
	static void insertAtposition()
	{
		Scanner sc=new Scanner(System.in);
		 int r=0;

		do
		{
		
		System.out.println("enter 1 for insert at beg\n"+"enter 2 for insert at last\n"+"enter 3 for insert thr position\n"+"enter 4 for display()");
		int y=sc.nextInt();
		
	    switch(y)
	    {
	    case 1:
	    	System.out.println("Enter the element ");
	    	int w=sc.nextInt();
	    	Node nn =new Node(w);
	    	Node temp= head;
	    	if(head==null)
	    	{
	    		head=nn;
	    		tail=nn;
	    	}
	    	else
	    	{
	    		nn.next=head;
	    		temp.prev=nn;
	    		head=nn;
	    		
	    	}
	    	break;
	    case 2:
	    	System.out.println("Enter the element ");
	    	int e=sc.nextInt();
	    	 nn =new Node(e);
	    	 if(head==null)
	    	 {
	    		 head=nn;
	    		 tail=nn;
	    		 
	    	 }
	    	 else
	    	 {
	    		tail.next=nn;
	    		nn.prev=tail;
	    		tail=nn;
	    		
	    				 
	    	 }
	    	 break;
	    case 3:
   	        System.out.println("enter psition ");
	 	    int s =sc.nextInt();
	 	    System.out.println("enter the value");
	        int d=sc.nextInt();
	        nn=new Node(d);
	        Node temp1=head;
	        Node ptr=temp1.next;
	        for(int i=0;i<s-1;i++)
	        {
	        	temp1=ptr;
	        	ptr=ptr.next;
	        }
	        nn.prev=temp1;
	        nn.next=ptr;
	        temp1.next=nn;
	        ptr.prev=nn;
	        
    	   break;
	    case 4:
	    	Display();
	    }
	    System.out.println("enter 1 to add element");
	    r =sc.nextInt();
		}while(r==1);
	    
	}
	static void Delete()
	{
		Scanner sc=new Scanner(System.in);
		int v=0;
		do {
		//Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 for delate at first\n"+"enter 2 for to delete at last\n"+"enter 3 to delete at psotion"+"enter 4 for display");
		int x =sc.nextInt();
		switch(x)
		{
		case 1:
			Node temp=head;
			head=temp.next;
			head.prev=null;
			break;
		case 2:
			Node temp1=tail;
			tail=temp1.prev;
			temp1.prev.next=null;
			break;
		case 3:
			Node temp2=head;
			Node ptr= temp2.next;
			System.out.println("Enter the psotio");
			int g = sc.nextInt();
             for(int i=1;i<g-1;i++)
             {
            	 temp2=ptr;
            	 ptr=ptr.next;
             }
             temp2.next=ptr.next;
             ptr.next.prev=temp2;
             break;
             
		case 4:
			Display();
			
			
		
		}
		System.out.println("more delete enter 1");
		v= sc.nextInt();
		}while(v==1);
	}
	static void Display()
	{
		if(head==null)
		{
			System.out.println("Linked does not exist");
		}
		else
		{
			Node temp=head;
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}

	public static void main(String[] args) {
		DLinked l = new DLinked();
//		creation(10);
//		creation(12);
//		creation(13);
//		creation(14);
		//Insertatlast(45);
		//Insertatlast(44);
		//Insertatlast(43);
		insertAtposition();
		Delete();
		
		//Display();
				

	}

}
