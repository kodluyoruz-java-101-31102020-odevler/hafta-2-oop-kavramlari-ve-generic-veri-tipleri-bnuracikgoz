package com.week2.main.question1;

public class Application {

	public static void main(String[] args) {
		// 5X5'lik matris!
				
		int[][] matriceInput = {
				{ 1, 2, 3, 4, 5 },
				{ 16,17,18,19,6 },
				{ 15,24,25,20,7 },
				{ 14,23,22,21,8 },
				{ 13,12,11,10,9 }
		};
		/*
		for (int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==0) {System.out.print(matriceInput[i][j]);};
			}
		}*/
		
		int m=5;
		int n=5;
		int k=0;
		int l=0;
		int i;
		 while (k < m && l < n) {
		        /* Print the first row from
		               the remaining rows */
		        for (i = l; i < n; ++i) {
		            System.out.print(matriceInput[k][i]+" "); 
		        }
		        k++;
		 
		        /* Print the last column
		         from the remaining columns */
		        for (i = k; i < m; ++i) {
		        	 System.out.print(matriceInput[i][n - 1]+" ");
		        }
		        n--;
		 
		        /* Print the last row from
		                the remaining rows */
		        if (k < m) {
		            for (i = n - 1; i >= l; --i) {
		            	System.out.print(matriceInput[m - 1][i] +" ");
		                
		            }
		            m--;
		        }
		 
		        /* Print the first column from
		                   the remaining columns */
		        if (l < n) {
		            for (i = m - 1; i >= k; --i) {
		            	System.out.print(matriceInput[i][l]+" ");
		            }
		            l++;
		        }
		    }

	}

}
