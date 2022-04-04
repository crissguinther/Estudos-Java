package entities;

public class Account {

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

	public void deposit(Double ammount) {
		balance += ammount;
	}
	
	public void withdraw(Double ammount) {
		if(ammount <= balance) balance -= ammount;
	}

}
