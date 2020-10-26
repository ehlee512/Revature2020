package eg1;
import eg1.printClass;
import eg2.aClass;

public class main {
	public static void main(String[] args) {
		printClass a = new printClass();
		a.print();
		
		printClass.innerClass b= a.new innerClass();	
		b.printHello();
		
		
		aClass x = new aClass();
		x.printHello();
		aClass.innerClass y = x.new innerClass(); //initializing an inner class from differnet package
		y.printHello();
	
		
	}

}
