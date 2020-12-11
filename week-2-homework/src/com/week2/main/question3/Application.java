package com.week2.main.question3;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		/* Dizi boyutu dışardan alınan ve elemanları 0-10 arasındaki
		random sayılardan olusan data dizisi tanımlandı*/

		Scanner sc=new Scanner(System.in);
		System.out.println("Dizi Boyutunu giriniz");
		int size=sc.nextInt();
		
		int[] data = new int[size];
		
		for(int i = 0; i < size; i++) {
			data[i] = (int)(Math.random() * 10);
		}
	
		boolean T=false;
		System.out.print("Dizi= ");
		for(int i = 0; i < size; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();

		/* Dizide ki tekrarlı rakamları bulan döngü */
		System.out.print("Mükerrer elemanlar = ");
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(data[i]==data[j]) {
					System.out.print(data[i]+" ");
					i++;
					T=true;
				   }
			   }
		  }
		sc.close();
		if (T == false) {
		 System.out.print("Dizide tekrarlı eleman yoktur!");
		}
		
	}
		
}
