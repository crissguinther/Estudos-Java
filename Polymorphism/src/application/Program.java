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
			Boolean outsourced = null;

			do {
				System.out.print("Outsourced (y/n)? ");

				switch (sc.next()) {
				case "y":
					outsourced = true;
					break;
				case "n":
					outsourced = false;
					break;
				default:
					System.out.println("Please, enter \"y\" or \"n\" ");
					continue;
				}

			} while (outsourced.equals(null));

			if (outsourced.equals(true))
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

			if (outsourced.equals(true)) {
				System.out.print("Additional charge: ");
				((OutsourcedEmployee) employee).setAdditionalCharge(sc.nextDouble());
			}

			employeeList.add(employee);
		}

		for (Employee e : employeeList) {
			System.out.println(e.getName() + " - $" + e.payment());
		}

	}

}
