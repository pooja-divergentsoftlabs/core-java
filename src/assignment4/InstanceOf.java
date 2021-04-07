package assignment4;

public class InstanceOf {
 public static void main(String[] args) {
	 
	 A a=new A();
	 B b=new B();
	 System.out.println(a instanceof A);
	 
	
}	
}

class A{
	public void dance() {
		System.out.println("Dancing");
	}
}

class B{
	public void sing() {
		System.out.println("Singing");
	}
}

