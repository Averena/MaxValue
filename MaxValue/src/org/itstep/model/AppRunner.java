package org.itstep.model;

public class AppRunner {

	public static void main(String[] args) {
		
		MaxValue calculation =  new MaxValue ();
		calculation.setValues(100, 40, 50.789);
		//calculation.getMaxValue();
		
		System.out.println("MaxValue = "+ calculation.getMaxValue());
		
		
	}

}
