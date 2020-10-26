package wrapper_class_practice;

public class demo1 {
	public static void main(String[] args) {
		Integer a = 19;
		System.out.println("printing Integer " +a.toString());
		
		String thisString = a.toString();
		System.out.println("printing string: " + thisString);
		
		double thisDouble = a.doubleValue();
		thisDouble = 29994.22;
		System.out.println("printing doulbe: " + thisDouble);
		
	}
}
