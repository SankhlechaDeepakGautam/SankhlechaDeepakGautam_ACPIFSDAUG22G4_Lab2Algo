package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.denomination.Denomination;

public class Main {

	public static void main(String[] args) {
		
		Denomination denomination = new Denomination();
		
		Scanner sc = new Scanner(System.in);
		int noOfDenomination;
		System.out.println("enter the size of currency denomination");
		noOfDenomination = sc.nextInt();
		System.out.println("enter the currency denomination value");
		int[]array = new int[noOfDenomination];
		for(int i=0;i<noOfDenomination;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		denomination.bubbleSort(array);
		denomination.noOfNotes(array, amount);
           sc.close();
	}

}
