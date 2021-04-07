package assignment4;

public class MethodOverloading {
	
	public static void name(String x) {
		System.out.println(x);
	}
	
	public static void name(String x, String y) {
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String args[]) {
		name("avni");
		name("pooja","saloni");
		
	}

}
