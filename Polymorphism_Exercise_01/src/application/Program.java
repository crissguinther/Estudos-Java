package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> employeeList = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Enter employee #" + i + " data");

			Employee employee = null;
			
			System.out.print("Outsourced (y/n)?: ");

			char outsourced = sc.next().charAt(0);
			sc.nextLine();
						
			if (outsourced == 'y')
				employee = new OutsourcedEmployee();
			else
				employee = new Employee();

			System.out.print("Name: ");
			employee.setName(sc.next());
			sc.nextLine();

			System.out.print("Hours: ");
			employee.setHours(sc.nextInt());

			System.out.print("Value per hour: ");
			employee.setValuePerHour(sc.nextDouble());

			if (outsourced == 'y') {
				System.out.print("Additional charge: ");
				((OutsourcedEmployee) employee).setAdditionalCharge(sc.nextDouble());
			}

			employeeList.add(employee);
		}

		for (Employee e : employeeList) {
			System.out.println(e.getName() + " - $" + e.payment());
		}

		sc.close();

	}

}
