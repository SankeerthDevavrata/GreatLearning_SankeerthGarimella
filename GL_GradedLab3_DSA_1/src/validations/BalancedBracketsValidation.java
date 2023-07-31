package validations;

import stack_DS.stack_LIFO;

public class BalancedBracketsValidation {
	String stringInput;
	public BalancedBracketsValidation(String stringInput) {
		this.stringInput=stringInput;
	}
	
	public Boolean checkBrackets() {
		stack_LIFO stack = new stack_LIFO();
		for(int i=0;i<stringInput.length();i++) {
			char s=stringInput.charAt(i);
			if(s=='(' || s=='[' || s=='{') stack.push(String.valueOf(s));
			else 
            {
                if(stack.empty()=="t" || ( stack.peek() =='(' && s !=')') || (stack.peek()=='[' && s!=']') || (stack.peek()=='{' && s!='}')) { 
                    return false;
                    }
                stack.pop();
            }
		}
		if(stack.empty()=="t")
			return true;
        else 
        	return false;
	}
	
}
