
public class Tower_Hanoi {
	static void Tower(int n,String src,String hel,String Des)
	{
		if(n==1)
		{
			System.out.println(n+" from "+src+" to "+Des);
			return;
		}
		Tower(n-1,src,Des,hel);
		System.out.println(n+" from "+src+" to "+Des);
		Tower(n-1,hel,src,Des);
	}

	public static void main(String[] args) {
		Tower(3,"S","H","D");

	}

}
