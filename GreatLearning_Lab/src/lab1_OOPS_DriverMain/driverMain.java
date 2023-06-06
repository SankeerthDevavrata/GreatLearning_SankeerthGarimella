package lab1_OOPS_DriverMain;

import java.util.Scanner;
import lab1_OOPS_Template.EmployeeCredentialService;

public class driverMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String firstName,lastName;
		System.out.println("Enter first name : ");
		firstName=sc.nextLine();
		System.out.println("Enter last name : ");
		lastName=sc.nextLine();
		
		String employDepartment;
		System.out.println("Enter Department :");
		System.out.println("Technical (tech)");
		System.out.println("Admin (adm)");
		System.out.println("Human Resources (hr)");
		System.out.println("Legal (legal):");
		employDepartment=sc.nextLine();

		EmployeeCredentialService employee1 = new EmployeeCredentialService(firstName,lastName,employDepartment);
		
		employee1.showDetails();


		
		sc.close();
	}

}
