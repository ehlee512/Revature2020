package eg2;



public class Calculator {
	
	public static void helloStaticCalci() {
		System.out.println("helloStaticCalci()");
	}
		
	public void helloNonStaticCalci() {
		System.out.println("helloNonStaticCalci()");
	}
	
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
		

}
