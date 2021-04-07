package assignment5;


class Parent{
	String name;
	public void method() {
		System.out.println("Method Parent");
	}
}

class Child extends Parent{
	int id;
	
	@Override
	public void method() {
		System.out.println("Method Child");
	}
	
}

public class Casting {
	
	public static void main(String[] args) {
		
		//upcasting
		Parent p = new Child();
		p.name="Pooja";
		System.out.println(p.name);
		p.method();
		
		//downcasting
		Child c = (Child)p;
		c.id=101;
		System.out.println(c.name);
		System.out.println(c.id);
		c.method();
		
	}

}
