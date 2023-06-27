import java.util.Arrays;

public class Binary_Search {

	public static void main(String[] args) {
		int arr[] = {1,7,8,4,4,4,4};
		Arrays.sort(arr);
		
		int mid =0;
		int target =0;
		int i=0;
		while( i<arr.length) {
			target =arr[i];
			int beg=0;
			int end=arr.length-1;
			int count=0;
		while(beg<=end)
		{
			mid =(beg+end)/2;
			if (arr[mid]==target)
			{
				//System.out.println("item found");
				count++;
				beg=mid+1;
				
//				if(count >arr.length/2)
//				{
//					System.out.println(arr[mid]);
//					break;
//				}
			}
			else if(target >=arr[mid])
			{
				beg=mid+1;
			}
			else if(target <= arr[mid])
			{
				end= mid-1;
			}
		}
		if(count >arr.length/2)
		{
			System.out.println(arr[mid]);
			break;
		}
		i++;
		
	}
	}

}
