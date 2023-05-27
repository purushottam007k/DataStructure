package staticstk;

public class TesterStk {

	public static void main(String[] args) {
		Stack s=new Stack(10);
//		int v =s.pop();
//		if(v!=-1) {
//			System.out.println("poped Element from Stack -"+v);
//		}
		s.push(12);
		s.push(2);
		s.push(32);
		s.push(65);
		s.push(78);
		s.display();
		
		int v =s.pop();
		if(v!=-1) {
			System.out.println("poped Element from Stack -"+v);
		}
		s.display();
		
		v=s.peak();
		if(v!=-1) {
			System.out.println("Top most Element of Stack -"+v);
		}
		s.display();
		
	}

}
