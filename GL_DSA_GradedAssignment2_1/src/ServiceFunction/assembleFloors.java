package ServiceFunction;

import java.util.*;


public class assembleFloors {
	
	int TotalFloors;
	Set<Integer> floorSizeData ;
	
	Scanner sc=new Scanner(System.in);
	
	public assembleFloors(int TotalFloors){
		this.TotalFloors=TotalFloors;
	}
	
	public assembleFloors() {}

	public void floorSizeInput(){

		floorSizeData=new LinkedHashSet<>();
		
		for(int size=1;size<=TotalFloors;size++) {
			System.out.println("Enter the floor size given on day : "+size);
			int floorSize=sc.nextInt();
			
			while (floorSizeData.contains(floorSize)) {
                System.out.println("Duplicate input. Please enter a unique integer.");
                System.out.println("Enter the floor size given on day : "+size);
                floorSize = sc.nextInt();
            }
			floorSizeData.add(floorSize);
		}
	}
	
	public void constructionOrder() {
		int max = TotalFloors;
		 int day=1;
		 Queue<Integer> constructionQueue = new PriorityQueue<Integer>(Comparator.reverseOrder());
		 System.out.println("The order of construction is as follows : ");
		 for (Integer floor : floorSizeData) {
			 constructionQueue.offer(floor);
			 System.out.print("Day "+(day)+" : ");
			 while(!constructionQueue.isEmpty() && constructionQueue.peek()==max) {
				 System.out.print(constructionQueue.poll()+" ");
				 max--;
			 }
			 day++;
			 System.out.println();
		 }
		 
		
	}
	
	
}
