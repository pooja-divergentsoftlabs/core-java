package assignment4;

public class ConstructorChaining {
	
	ConstructorChaining(){
		System.out.println("Default constructor");// 1 default
	}
	
	ConstructorChaining(int x){
		//invoke default constructor
		this();
		System.out.println(x);// 2 constructor
	}
	ConstructorChaining(int x ,int y){
		//invoke 2 constructor
		this(10);
		System.out.println(x+y);//3 constructor
	}
	
	
	public static void main(String args[]) {
		new ConstructorChaining(10,5); //invoke 3 constructor
	}

}
