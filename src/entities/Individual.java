package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;

	public Individual() {
	}

	public Individual(String name, Double anuallncome, Double healthExpenditures) {
		super(name, anuallncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		if (anualIncome < 20000) {
			return (anualIncome * 0.15) - (healthExpenditures * 0.5);
		} else {
			return (anualIncome * 0.25) - (healthExpenditures * 0.5);
		}
	}
}
