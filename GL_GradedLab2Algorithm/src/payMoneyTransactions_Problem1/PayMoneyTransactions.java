package payMoneyTransactions_Problem1;

import java.util.Scanner;

public class PayMoneyTransactions {
	int transactionArraySize;
	int transactionArray[];
	Scanner sc = new Scanner(System.in);
	public PayMoneyTransactions(){};
	
	public void transactionArray() {
		System.out.println("enter the size of transaction array : ");
		transactionArraySize =sc.nextInt();
		transactionArray=new int[transactionArraySize];
		System.out.println("enter the values of array : ");
		for(int i=0;i<transactionArraySize;i++) {
			transactionArray[i]=sc.nextInt();
		}

	}
	
	public void dailyTarget() {
		System.out.println("enter the total no of targets that needs to be achieved : ");
		int dailyTotalTargets=sc.nextInt();
		int count=0;
		while(dailyTotalTargets!=0) {
			count++;
			int targetValue=0;
			System.out.println("enter the "+count+" value of target");
			targetValue=sc.nextInt();
			int sum=0;
			for(int i=0;i<transactionArraySize;i++) {
				sum=sum+transactionArray[i];
				if(sum>=targetValue) {
					System.out.println("target is achieved after "+(i+1)+" transactions");
					System.out.println();
					break;
				}else if(i==transactionArraySize-1 && sum<targetValue) {
					System.out.println("Given target is not achieved ");
				}
			}
			dailyTotalTargets--;
		}
	}
}
