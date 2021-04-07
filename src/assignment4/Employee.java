package assignment4;

import java.time.LocalDate;

public class Employee {
	
	private String name;
	private LocalDate hireDate;
	private Double salary;
	
	
	private Employee(String name, LocalDate hireDate, Double salary) {
	     
		this.name = name;
		this.hireDate = hireDate;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public Double getSalary() {
		return salary;
	}

	
	public static Employee StaticMethod(String name, LocalDate hireDate, Double salary) {
		return new Employee(name, hireDate, salary);
	}

	public static void main(String[] args) {
		Employee employee[] = new Employee[4];
		employee[0] = StaticMethod("Pooja", LocalDate.of(2021, 03, 15), 9456.12);
		employee[1] = StaticMethod("Avni", LocalDate.of(2021, 03, 15), 654.24);
		employee[2] = StaticMethod("Aditya", LocalDate.of(2021, 03, 15), 86557.24);
		employee[3] = StaticMethod("kamini ", LocalDate.of(2021, 03, 15), 8754.234);
		
		
		for (Employee e : employee) {
			System.out.println(e); 
		}
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "name is "+name+" date is "+hireDate+" salary is "+salary;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Employee e = (Employee)obj;
		
		
		if(this==obj){
			return true;
		}
		
		if(obj==null) {
			return false;
		}
		
		return false;
		
	}
		
	}
	


