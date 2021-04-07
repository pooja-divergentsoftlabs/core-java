package assignment5;

public class DynamicBinding {
	
	void eat() {
		System.out.println("Eating");
	}
	
	static class Person extends DynamicBinding{
		void eat() {
			System.out.println("person is eating");
			
		}
		
		public static void main(String[] args) {
			DynamicBinding db = new Person();
			db.eat();
		}
	}
}


