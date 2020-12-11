package com.week2.main.question4;

public class CarInsurance extends Insurance {
	
	@Override
	public double calculate(double value, double ratio){
		
		if(value < 10000) {
			double newRatio = ratio - (ratio * 0.02);
			if(newRatio > 0) {
				return value * newRatio;
			}
		}
		else if(value > 100000) {
			double newRatio = ratio + (ratio * 0.80);
			if(newRatio > 0) {
				return value * newRatio;
			}
		}
		
		return (value * ratio) + 74;
	}
}
