import java.util.Arrays;

public class Merge {
	static void merg1(int arr[],int start,int mid,int end)
	{
		System.out.println(start+""+mid+""+end);
		int l =mid - start + 1;
		int r =end-mid;
		int left[] = new int[l];
		int right[] = new int[r];
		for(int i=0;i<l;i++)
		{
			left[i]=arr[start + i];
		}
		for(int j=0;j<r;j++)
		{
			right[j]=arr[mid+1+j];
		}
		int i=0;
		int j = 0;
		int k = start;
		while(i<l&&j<r)
		{
			if(left[i]<=right[j])
			{
				arr[k]=left[i];
				i++;
			}
			else
			{
				arr[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<l)
		{
			arr[k]=left[i];
			i++;
			k++;
		}
		while(j<r)
		{
			arr[k]=right[j];
			j++;
			k++;
		}
		
	}
	static void merg(int arr[],int start,int end)
	{
 		if(start < end)
		{
			int mid = (start+end)/2;
			merg(arr,start,mid);
			merg(arr,mid+1,end);
			merg1(arr,start,mid,end);
		}
	}

	public static void main(String[] args) {

		int arr[] = {7,1,2,6,8,5,3,4};
		
		merg(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
