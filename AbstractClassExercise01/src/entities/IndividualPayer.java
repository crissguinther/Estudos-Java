package entities;

public class IndividualPayer extends Payer {

	private Double healthcareSpent;

	public IndividualPayer() {
		super();
	}

	public IndividualPayer(String name, Double annualProfit, Double healthcareSpent) {
		super(name, annualProfit);
		this.healthcareSpent = healthcareSpent;
	}

	@Override
	public final Double tax() {
		Double tax = null;

		if (this.annualProfit.compareTo(20000.00) < 0)
			tax = 00.15;
		else
			tax = 00.25;

		return healthcareSpent != 0.0 ? (this.annualProfit * tax) - (healthcareSpent * 0.5) : (this.annualProfit * tax);

	}

}
