package entities;

public class EnterpriseAccount extends Account {

	private Double loanLimit;
	
	public EnterpriseAccount() {
		super();
	}

	public EnterpriseAccount(Integer id, String holder, Double balance, Double loanLimit) {
		super(id, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void getLoan(Double ammount) {
		if(ammount <= loanLimit) balance += (ammount - 10.00);
	}
	
}
