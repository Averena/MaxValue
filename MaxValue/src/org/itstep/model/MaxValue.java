package org.itstep.model;

public class MaxValue {

	int a;
	long b; 
	double c;
	
	public void setValues(int A, long B, double C) {
		this.a = A;
		this.b = B;
		this.c = C;
	}
	
	public double getMaxValue() {
		double ab = (double)this.a * (double)this.b;
		double ac = (double)this.a * this.c;
		double bc = (double)this.b * this.c;
		
		if (ab > ac && ab > bc) {
			return ab;
		} else if (ac < bc && ab < bc) {
			return bc;
		} else if (ab < ac && ac > bc) {
			return ac;
		} else {
			return 0.0;
		}
		
	}
}
