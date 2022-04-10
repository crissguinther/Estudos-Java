package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.WithdrawAmmountException;
import model.exceptions.WithdrawLimitException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data: ");
			System.out.print("Number: ");
			Integer number = sc.nextInt();
			System.out.print("Holder: ");
			String holder = sc.next();
			sc.nextLine();
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();
			
			Account acc = new Account(number, holder, balance, withdrawLimit);
			
			System.out.print("Enter ammount for withdraw: ");
			Double ammount = sc.nextDouble();
			
			acc.withdraw(ammount);
			
			System.out.printf("Withdraw of %.2f", ammount);
		} catch(WithdrawAmmountException e) {
			System.out.println(e.getMessage());
		} catch(WithdrawLimitException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Please, enter a valid name/number!");
		}

	}

}
