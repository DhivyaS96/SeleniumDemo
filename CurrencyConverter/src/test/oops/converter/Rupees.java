package test.oops.converter;

public class Rupees implements Money{
	double dollar;
	double euro;
	double pound;

	@Override
	public void convert(int amt) {
		dollar=amt*0.013;
		euro=amt*0.012;
		pound=amt*0.011;
		System.out.println("Rupees converted to Dollar:"+dollar);
		System.out.println("Rupees converted to Euro:"+euro);
		System.out.println("Rupees converted to Pound:"+pound);
		
	}

	
	

}
