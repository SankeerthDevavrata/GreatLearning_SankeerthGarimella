package stack_DS;

public class stack_LIFO {
	final int sizeOfStack=100;
	int currentPointer;
	String arr[]=new String[sizeOfStack];
	
	public stack_LIFO() {
		currentPointer=-1;
	}
	
	public boolean push(String x) {
		if(currentPointer<(sizeOfStack-1)) {
			arr[++currentPointer]=x;
			return true;
		}else {
			//System.out.println("Stack Overflow");
			return false;
		}
	}
	
	public String pop() {
		if(currentPointer<=-1) {
			//System.out.println("Stack Underflow");
			return "!";
		}else {
			String x=arr[currentPointer--];
			return x;
		}
	}
	
	public char peek() {
		//System.out.println("Top element in the stack:");
		return arr[currentPointer].charAt(0);
	}
	
	public String empty() {
		if(currentPointer>=0) return "f";
		else return "t";
	}
	
	void printStack() {
		System.out.println("Elements in the stack:");
		for(int i=currentPointer;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
}