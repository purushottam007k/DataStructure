import java.util.Scanner;

public class Singly {

	static S_Node head;
	static S_Node tail;
	Singly()
	{
		head=null;
	}
	static void insertAtlast(int a)
	{
		S_Node nn =new S_Node(a);
		if(head==null)
		{
			head=nn;
		}
		else
		{
			S_Node temp =head;
			while(temp.next!=null)
			{
				//temp.next=nn;
				temp=temp.next;
			}
			temp.next=nn;
			
		}
	}
	static void  insertAtbeg(int a)
	{
		S_Node nn =new S_Node(a);
		nn.next=head;
		head=nn;
	}
	static void insertAtposition()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter psition ");
    int s =sc.nextInt();
    System.out.println("enter the value");
    int x =sc.nextInt();
    S_Node nn= new S_Node(x);
    S_Node temp=head;
    S_Node ptr=temp.next;
    for(int i=1;i<s-1;i++)
    {
    	temp=ptr;
    	ptr=ptr.next;
    }
    nn.next=ptr;
    temp.next=nn;
		
		
	}
	static void deleteAtbeg()
	{
		S_Node temp= head;
		head=temp.next;
		}
	static void deleteAtlast()
	{
		S_Node temp= head;
		S_Node ptr=temp.next;
		while(ptr.next!=null)
		{
			
			temp=ptr;
			
			ptr=ptr.next;
		}
		temp.next= null;
	}
	
	
	static void deleteAtposition()
{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number 1 for delete at beg \n"+"enter number  for delete at last\n"+"enter number to delete rather than beg and last");
        int s =sc.nextInt();
		
		switch(s) {
		case 1:
			S_Node temp=head;
			head=temp.next;
			break;
		case 2:
			 temp=head;
			S_Node ptr=temp.next;
			while(ptr.next!=null)
			{
				temp=ptr;
				ptr=ptr.next;
			}
			temp.next=null;
			break;
		case 3:
			 temp=head;
			 ptr=temp.next;
			 System.out.println("enter the position you want delete");
			 int c=sc.nextInt();
		   for(int i=0;i<=c-3;i++){
			   temp=ptr;
			   ptr=ptr.next;
				
			}
		   temp.next=ptr.next;
			
			
		}
}
		
		
	static void insertbeg()
	{
		S_Node temp=head;
		
	}
	static void Display()
	{
		S_Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	
	public static void main(String[] args) {
		Singly S =new Singly();
		insertAtlast(5);
		insertAtlast(6);
		insertAtlast(7);
		insertAtlast(8);
		insertAtlast(9);
		insertAtposition();
		//insertAtbeg(10);
		//deleteAtbeg();
		//deleteAtlast();
		//deleteAtposition();
		Display();
		

	}

}
