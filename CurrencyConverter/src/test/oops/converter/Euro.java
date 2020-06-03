package test.oops.converter;

public class Euro implements Money{
	
	double rupees;
	double pound;
	double dollar;

	@Override
	public void convert(int amt) {
		rupees=amt*83.87;
		pound=amt*0.90;
		dollar=amt*1.11;
		System.out.println("Euro converted to Rupees: "+rupees);
		System.out.println("Euro converted to Pound: "+pound);
		System.out.println("Euro converted to Dollar: "+dollar);
		
	}

	
}
