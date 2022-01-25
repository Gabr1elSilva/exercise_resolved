package entities;

public abstract class TaxPayer {

	private String name;
	protected Double anualIncome;

	public TaxPayer() {
	}

	public TaxPayer(String name, Double anuallncome) {
		this.name = name;
		this.anualIncome = anuallncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnuallncome() {
		return anualIncome;
	}

	public void setAnuallncome(Double anuallncome) {
		this.anualIncome = anuallncome;
	}

	public abstract double tax();

}
