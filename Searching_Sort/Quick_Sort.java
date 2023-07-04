import java.util.Arrays;

public class Quick_Sort {
	static int Partion(int arr[],int i,int a)
	{
		int Pindex =i;
		int Pivot =arr[a];
		 for(;i<a;i++)
	     {
	    	 if(arr[i]<Pivot)
	    		 
	    	 {
	    		 int temp=arr[i];
	    		 arr[i]=arr[Pindex];
	    		 arr[Pindex]=temp;
	    		 Pindex++;
	    	 }
	    	 else
	    	 {
	    		 continue;
	    	 }
	     }
	     int temp=arr[i];
	     arr[i]=arr[Pindex];
	     arr[Pindex]=temp;
	     return Pindex;
	}
	static void Quick(int arr[],int start,int end)
	{
		if(start<end)
		{
			int p=Partion(arr,start,end);
			Quick(arr,start,p-1);
			Quick(arr,p+1,end);
			
		}
	}

	public static void main(String[] args) {
     int arr[] = {7,2,1,6,8,5,3,4};
     System.out.println(Arrays.toString(arr));
     Quick(arr,0,arr.length-1);
     System.out.println(Arrays.toString(arr));
     
     
	}

}
