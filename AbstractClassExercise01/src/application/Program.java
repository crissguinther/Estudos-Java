package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CompanyPayer;
import entities.IndividualPayer;
import entities.Payer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Payer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.printf("Tax payer #%d data: %n", i);

			System.out.print("Individual or company (i/c)? :");
			char ch = sc.next().charAt(0);
			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.next();
			sc.nextLine();
			
			System.out.print("Annual income: ");
			Double annualProfit = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				Double healthcareSpent = sc.nextDouble();
				list.add(new IndividualPayer(name, annualProfit, healthcareSpent));
			} else {
				System.out.print("Number of employees: ");
				Integer employeesNumber = sc.nextInt();
				list.add(new CompanyPayer(name, annualProfit, employeesNumber));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		for(Payer payer : list) {
			System.out.println(payer.toString());
		}

		sc.close();
	}

}
