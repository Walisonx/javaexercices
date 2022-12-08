package program;

import java.util.Locale;
import java.util.Scanner;

import entities.employee;

public class exe2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		employee employee = new employee();
		
		System.out.println("Name: ");
		employee.name = sc.nextLine();
		System.out.println("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println(employee);
		System.out.println();
		
		System.out.println("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage); 
		
		System.out.println("Updated data: " + employee.name+ " $ " + employee.netSalary());
		
		
		sc.close();
	}

}
