package DriverMain;

import java.util.Scanner;

import ServiceFunction.assembleFloors;

public class driverMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the total no of floors in the building : ");
		int totalFloors=sc.nextInt();
		
		assembleFloors skyscraper = new assembleFloors(totalFloors);
		
		skyscraper.floorSizeInput();
		skyscraper.constructionOrder();
		
		sc.close();
		
	}

}
