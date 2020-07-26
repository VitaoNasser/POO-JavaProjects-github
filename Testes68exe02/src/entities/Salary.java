package entities;

public class Salary {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public void increaseSalary(double percentage) {
		grossSalary += ((grossSalary * percentage)/100);
	}
	
	public double netSalary() {
		return grossSalary - tax;
	}

}
