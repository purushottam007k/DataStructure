
import java.util.Arrays;
import java.util.Scanner;
public class Que {
	static int f=-1;
	static int r=-1;
	static int n=10;
	static int arr[]=new int[n];
	
	static void enqueue()
	{
		Scanner sc=new Scanner(System.in);
		if(r==(n-1))
		{
			System.out.println("overflow");
		}
		else
		{
			if(r==-1 && f==-1)
			{
				f=0;
				r=0;
				arr[r]=sc.nextInt();
			}
			else
			{
				r+=1;
				System.out.println("enter the element");
				arr[r]=sc.nextInt();
			}
		}
		
	}
	static void dqueue()
	{
		if(f==-1&& r==-1)
		{
			System.out.println("underflow");
		}
		else
		{
			
			f+=1;
			}
	}
	static void Display()
	{
		Arrays.toString(arr);
	}

	public static void main(String[] args) {
		System.out.println("enter the choice"+"\n1 for insert"+"\2 for delete");
		Scanner sc=new Scanner(System.in);
		switch(sc.nextInt())
		{
		case 1:
			 enqueue();
			 break;
		case 2:
			dqueue();
			break;
		case 3 :
			Display();
			
		   
		}
		
	}

}
