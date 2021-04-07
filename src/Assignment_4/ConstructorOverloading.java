package Assignment_4;

public class ConstructorOverloading {
	
	int number;
	String name;
	int fees;
	
	public ConstructorOverloading(int n,String s) {
		number=n;
		name=s;
	}
	
	public ConstructorOverloading(int n,String s, int f ) {
		number=n;
		name=s;
		fees=f;
	}
	void display() {
		System.out.println(number+" "+name+" "+fees);
	}
	
	public static void main(String args[]) {
		ConstructorOverloading cs1= new ConstructorOverloading(101, "Pooja");
		ConstructorOverloading cs2= new ConstructorOverloading(102, "Avni",50000);
		cs1.display();
		cs2.display();
		
	}

}
