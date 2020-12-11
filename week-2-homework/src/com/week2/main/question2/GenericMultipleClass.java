package com.week2.main.question2;

public class GenericMultipleClass <T> {

//private T[][] resultMatrice;

	public static <T> double[][] multiplyMatrices(double[][] firstMatrice,double[][] secondMatrice) {
		double[][] resultMatrice = new double[firstMatrice.length][secondMatrice[0].length];
			for (int i = 0; i < firstMatrice.length; i++) {
	            for (int j = 0; j < secondMatrice[0].length; j++) {
	                for (int k = 0; k < firstMatrice[0].length; k++) {
	                    resultMatrice[i][j] += firstMatrice[i][k] * secondMatrice[k][j];
	                }
	            }
	        }
	       return resultMatrice;
	}

 
}

//public static <T> double multiplyMatrice(T[][] firstMatrice, T[][] secondMatrice) {}
	



