package entities;

public abstract class Payer {

	protected String name;
	protected Double annualProfit;

	public Payer() {
	}

	public Payer(String name, Double annualProfit) {
		this.name = name;
		this.annualProfit = annualProfit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualProfit() {
		return annualProfit;
	}

	public void setAnnualProfit(Double annualProfit) {
		this.annualProfit = annualProfit;
	}

	@Override
	public String toString() {
		return this.getName() + String.format(" $ %.2f%n", tax());
	}
	
	public abstract Double tax();

}
