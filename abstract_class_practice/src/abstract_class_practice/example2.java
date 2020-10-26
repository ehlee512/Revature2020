package abstract_class_practice;

public class example2 extends AbstractExample {

	@Override
	public void addNum() {
		System.out.println("addNum method from examples 2");

	}

	@Override
	public void deleteNum() {
		// TODO Auto-generated method stub
		System.out.println("deleteNum method from example 2");
	}

	@Override
	public void deleteNum(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("deleteNum from example 2");
		System.out.println("┌ deleteNum(x, y)");
		System.out.println("│ x=" + x);
		System.out.println("│ y=" + y);
		System.out.println("└ x-y= " + (x - y));
	}
	
	

}
