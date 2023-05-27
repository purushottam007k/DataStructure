package dynamicstk;

public class TesterDynStk {

	public static void main(String[] args) {
		DynamicStack s=new DynamicStack();
		s.push(5);
		s.push(55);
		s.push(25);
		s.push(54);
		s.push(35);
		s.display();
		s.peak();
		s.pop();
		s.display();
	}
}
