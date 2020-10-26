package eg1;

public class Demo1 {
	
	public static void main(String[] args) {
	System.out.println("hello");
	myStaticMethod();
	//Anything which is non-static create object of that class to acess it
	//object creation Syntax	ClassName objName=new constructor(); Constructor will be having same name as class name 
	Demo1 d=new Demo1();
	d.myNonstaticMethod();
		
	}
	
	public static void myStaticMethod() {
		System.out.println("from mStaticMethod()");
	}
	
	
	
	
	public void myNonstaticMethod() {
		System.out.println("from myNonStaticMethod()");
		
	}
	
}
