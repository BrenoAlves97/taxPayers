package entities;

public class LegalPerson extends TaxPayer {

	private Integer employeeNumbers;
	
	public LegalPerson() {
		super();
	}
	
	
	public LegalPerson(String name, Double annualIncome, Integer employeeNumbers) {
		super(name, annualIncome);
		this.employeeNumbers = employeeNumbers;
	}


	public Integer getEmployeeNumbers() {
		return employeeNumbers;
	}


	public void setEmployeeNumbers(Integer employeeNumbers) {
		this.employeeNumbers = employeeNumbers;
	}


	@Override
	public Double tax() {
		if(employeeNumbers > 10) {
			return getAnnualIncome() * 0.14;
		} else {
			return getAnnualIncome() * 0.16;
		}
		
	}

}
