package application;

import entities.Account;
import entities.EnterpriseAccount;

public class Program {

	public static void main(String[] args) {
		
		EnterpriseAccount account = new EnterpriseAccount(101,"Foo bar", 1200.00, 2400.00);

		account.getLoan(2000.00);
		
		System.out.println(account.getBalance());
		
	}

}
