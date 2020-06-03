package test.oops.converter;

public class Dollar implements Money{
	
	double rupees;
	double euro;
	double pound;

	@Override
	public void convert(int amt) {
		rupees= amt*75.52;
		euro=amt*0.90;
		pound=amt*0.81;
		System.out.println("Dollar converted to Rupees: "+rupees);
		System.out.println("Dollar converted to Euro: "+euro);
		System.out.println("Dollar converted to Pound: "+pound);
		
	}


}
