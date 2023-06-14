
public class Reverse_String {
	
	static void Str(String v,int n)
	{
		if(n==0)
		{
			System.out.println(v.charAt(n));
			return;
		}
		System.out.print(v.charAt(n));
		Str(v,n-1);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String d="swaraj";
          Str(d,d.length()-1);
          
	}

}
