package assignment5;

public class EqualssMethod {
	
	private String shirt;
	
	public EqualssMethod(String shirt) {
		this.shirt=shirt;
	}
	
	public static void main(String[] args) {
		EqualssMethod eq1=new EqualssMethod("FB");
		EqualssMethod eq2=new EqualssMethod("Ea");
		
		System.out.println(eq1.equals(eq2));
		System.out.println(eq1);
		
	}
	
		
@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj==null) {
			return false;
		}
		if(obj instanceof EqualssMethod) {
			EqualssMethod eq =(EqualssMethod)obj;
			if(this.shirt==eq.shirt) {
				return true;
			}
		}
		
		
		return false;
	}
	
	
	@Override
	public int hashCode() {
		return shirt.hashCode();
	}

}
