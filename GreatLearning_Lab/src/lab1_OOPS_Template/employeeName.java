package lab1_OOPS_Template;

public class employeeName {
	String firstName,lastName;
	//String email;
	employeeName(){}
	employeeName(String firstName,String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
		
	}
//	public String generateEmail{
//		email=(new StringBuilder()).append(firstName+"."+lastName+"@greatLearning.").toString();	
//	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
