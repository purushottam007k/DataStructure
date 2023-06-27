import java.util.Arrays;

public class Insertion_Sort {

	public static void main(String[] args) {
        int arr[] = {25,15,30,9,99,20,26};
        int temp=0;
        for(int i=1;i<arr.length;i++)
        {
         temp=arr[i];
         int j=i-1;
         while ( j >=0 && temp < arr[j] )
         {
        	 arr[j+1] =arr[j];
        	 j=j-1;
         }
         arr[j+1]=temp;
        }
        System.out.println(Arrays.toString(arr));
       
       
	}

}
