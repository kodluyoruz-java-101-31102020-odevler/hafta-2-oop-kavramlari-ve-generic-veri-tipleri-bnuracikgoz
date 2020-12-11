package com.week2.main.question2;
import java.util.Scanner;
public class Application {

	public static void main(String[] args) {

		double[][] firstMatrice;
		double[][] secondMatrice;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Birinci matrisin satır sayısı?");
		int N = scanner.nextInt();
		
		System.out.println("Birinci matrisin sütun sayısı?");
		int M = scanner.nextInt();
		
		System.out.println("İkinci matrisin sütun sayısı?");
		int T = scanner.nextInt();

		
		firstMatrice = new double[N][M];
		secondMatrice = new double[M][T];
		
		firstMatrice=fill(firstMatrice);
		secondMatrice=fill(secondMatrice);
		
		double[][] resultMatrice = GenericMultipleClass.multiplyMatrices(firstMatrice, secondMatrice);
		displayResultMatrix(resultMatrice);
		
		scanner.close();
	}
	

public static double[][] fill(double[][] matrice) {
	int rowSize = matrice.length;
	int columnSize = matrice[0].length;
	
		for(int i=0; i < rowSize; i++) {
			for(int j=0; j < columnSize; j++) {
		
				double randomNumber = (double)Math.random()*10;
				matrice[i][j] = randomNumber;
			}
		}
		return matrice;
}
public static void displayResultMatrix(double [][] resultMatrice) {
	System.out.println("Result Matrix Values : ");
		for (double[] row : resultMatrice) {
			for (double column : row) {
				System.out.print(column + " ");
			}
			System.out.println();
		}	
	}
	
}

	
