package driverMain;

import java.util.Scanner;

import operation.MergeSort;
import operation.DenominationsCount;

public class driverMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of currency denominations : ");
		int currencySize=sc.nextInt();
		
		int currencyDenominationsArray[]=new int[currencySize];
		
		System.out.println("Enter the currency denominations value : ");
		
		for(int i=0;i<currencySize;i++) {
			currencyDenominationsArray[i]=sc.nextInt();
		}

		MergeSort.mergeSort(currencyDenominationsArray,0,currencySize-1,currencySize);
		
		System.out.println("enter the amount you want to pay : ");
		int amount=sc.nextInt();
		
		DenominationsCount.denominationCount(currencyDenominationsArray,currencySize,amount);
		
		sc.close();
	}


}
