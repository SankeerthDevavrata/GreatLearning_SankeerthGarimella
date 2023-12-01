package operation;

public class DenominationsCount {

public static void denominationCount(int[] currencyDenominationsArray, int currencySize, int amount) {
		
		int noteCounter[]=new int[currencySize];
		for(int i=0;i<currencySize;i++) {
			if(amount>=currencyDenominationsArray[i]) {
				noteCounter[i]=amount/(currencyDenominationsArray[i]);
				amount=amount-(currencyDenominationsArray[i]*noteCounter[i]);
			}
		}
		
		if(amount>0) {
			System.out.println("exact amount cannot be given with the highest denominations");
		}else {
			System.out.println("Your payment approach in order to give min no of notes will be");
			for(int i=0;i<currencySize;i++) {
				if(noteCounter[i]!=0) {
					System.out.println(currencyDenominationsArray[i]+":"+noteCounter[i]);
				}
			}
		}
	}
}

