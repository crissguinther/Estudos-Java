package entities;

public class CompanyPayer extends Payer {

	private Integer employeesNumber;

	public CompanyPayer() {
		super();
	}

	public CompanyPayer(String name, Double annualProfit, Integer employeesNumber) {
		super(name, annualProfit);
		this.employeesNumber = employeesNumber;
	}

	public Integer getEmployeesNumber() {
		return employeesNumber;
	}

	public void setEmployeesNumber(Integer employeesNumber) {
		this.employeesNumber = employeesNumber;
	}

	@Override
	public Double tax() {
		double tax = 0.0;

		if (employeesNumber.compareTo(10) < 0)
			tax = 0.16;
		else
			tax = 0.14;

		return (this.annualProfit * tax);
	}

}
