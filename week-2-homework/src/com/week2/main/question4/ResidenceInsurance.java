package com.week2.main.question4;

public class ResidenceInsurance extends Insurance {
	@Override
	public double calculate(double value, double ratio){
		
		if(value < 10000) {
			double newRatio = ratio - (ratio * 0.07);
			if(newRatio > 0) {
				return value * newRatio;
			}
		}
		else if(value > 100000) {
			double newRatio = ratio + (ratio * 0.20);
			if(newRatio > 0) {
				return value * newRatio;
			}
		}
		
		return (value * ratio) + 85;
	}
}
