package com.week2.main.question4;
import java.util.*;

public abstract class Insurance {
	public String sigortaIsmi;
	public double ücret;
	public String email;
	public Date sigortaBaslama;
	public Date sigortaBitis;

	public abstract double calculate(double value,double ratio);

		
}
