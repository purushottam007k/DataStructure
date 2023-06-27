import java.util.Arrays;

public class Selection_Sort {

	public static void main(String[] args) {
      int arr[] = {77,33,44,11,80,22,66,55};
      int j=0;
      int loc =0;
      for(int i=0;i<arr.length-1;i++)
      {
    	  loc =i;
    	  
    	  for(j=i+1;j<=arr.length-1;j++)
    	  {
    		  if(arr[loc] >arr[j] )
    		  {
    			  loc=j;
    		  }
    		  if(j==arr.length-1)
    		  {
    			  break;
    		  }
    	  }
    	  int c =arr[i];
    	  arr[i]=arr[loc];
    	  arr[loc]=c;
      }
      System.out.println( Arrays.toString(arr));
	}
	

}
