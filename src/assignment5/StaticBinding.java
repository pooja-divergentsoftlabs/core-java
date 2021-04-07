package assignment5;

public class StaticBinding {
	
	private void dance() {
		System.out.println("She is dancing");
	}
	
	public static void main(String[] args) {
		StaticBinding sb=new StaticBinding();
		sb.dance();
	}

}
