package entities;

public class SavingsAccount extends Account {
	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer id, String holder, Double balance, Double interestRate) {
		super(id, holder, balance);
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		balance += balance * interestRate;
	}

	@Override
	public void withdraw(Double amount) {
		balance -= amount;
	}
}
