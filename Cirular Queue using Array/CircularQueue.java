package ExcptionHandling;

import java.util.Scanner;

public class CircularQueue {
	int f=-1;
	int r=-1;
	int n=6;
    int arr[]=new int[6];
    Scanner sc=new Scanner(System.in);
    void enqueue()
    {
    	if(f==(r+1)%n)
    	{
    		System.out.println("over flow");
    	}
    	else
    	{
    		if(f==-1 && r==-1)
    		{
    			f=0;
    			r=0;
    			System.out.println("enter the element");
    			arr[r]=sc.nextInt();
    		}
    		else
    		{
    			r=(r+1)%n;
    			System.out.println("enter the element");
    			arr[r]=sc.nextInt();
    					
    		}
    		
    	}
    }
    void Dqueue()
    {
    	if(f==-1 && r==-1)
    	{
    		System.out.println("under flow");
    	}
    	else
    	{
    		f+=1;
    	}
    }
    void Display()
    { 
    	int i=0;
    	for( i=f;i!=r;i=(i+1)%n)
    	{
    		System.out.print(arr[i]+" ");
    		
    	}
    	System.out.print(arr[i]+" ");
    }
    
	public static void main(String[] args) {
		CircularQueue c =new CircularQueue();
		int a=0;
		do {
		System.out.println("enter the choice"+"\n1.for insert"+"\n2.for delet"+"\n3.for Display");
		Scanner sc= new Scanner(System.in);
		switch(sc.nextInt())
		{
			case 1:
				c.enqueue();
				break;
			case 2:
				c.Dqueue();
			case 3:
				c.Display();
			      
				
			
				}
		
		
	
	}while(a==0);
}
}


