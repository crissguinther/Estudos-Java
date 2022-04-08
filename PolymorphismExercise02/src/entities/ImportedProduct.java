package entities;

public class ImportedProduct extends Product {

	private Double customsFee;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	public Double totalPrice() {
		return customsFee + this.price;
	}

	@Override
	public final String priceTag() {
		return this.getName() + " $" + this.totalPrice() + "(Customs Fee: " + String.format("%.2f", this.customsFee) + ")";
	}
}
