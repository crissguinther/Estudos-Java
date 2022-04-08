package entities;

// Classes abstratas não podem ser instanciadas
public abstract class Account {

	private Integer id;
	private String holder;
	protected Double balance;

	public Account() {
	}

	public Account(Integer id, String holder, Double balance) {
		this.id = id;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) {
		if(amount <= balance) balance -= amount + 5.0;
	}

}
