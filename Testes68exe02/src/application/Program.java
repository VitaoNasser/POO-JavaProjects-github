package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Salary;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Salary salary = new Salary();
		
		System.out.printf("Name: ");
		salary.name = sc.nextLine();
		System.out.printf("Gross salary: ");
		salary.grossSalary = sc.nextDouble();
		System.out.printf("Tax: ");
		salary.tax = sc.nextDouble();
		
		System.out.println("Employee: " + salary.name + ", $ " + String.format("%.2f", salary.netSalary()));
		
		System.out.printf("Which percentage to increase salary? ");
		salary.increaseSalary(sc.nextDouble());
		
		System.out.println("Update data: " + salary.name + ", $ " + String.format("%.2f", salary.netSalary()));
		
		
		sc.close();

	}

}
