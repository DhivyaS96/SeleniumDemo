package test.oops.converter;

public class Pound implements Money{
	
	double rupees;
	double euro;
	double dollar;

	@Override
	public void convert(int amt) {
		rupees=amt*93.22;
		euro=amt*1.11;
		dollar=amt*1.23;
		System.out.println("Pound converted to Rupees: "+rupees);
		System.out.println("Pound converted to Euro: "+euro);
		System.out.println("Pound converted to Dollar: "+dollar);
	}

	

}
