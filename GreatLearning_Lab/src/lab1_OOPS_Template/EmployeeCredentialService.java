package lab1_OOPS_Template;

import java.util.Random;
import lab1_OOPS_LoginInterface.LoginInterface; 


public class EmployeeCredentialService extends employeeDepartment implements LoginInterface {
	String email,password;
	public EmployeeCredentialService(String firstName,String lastName,String departments){
		super(firstName,lastName,departments);
		email=generateEmail(firstName,lastName,departments);
		password=generatePassword();
		
	}
	@Override
	public  String generateEmail(String firstName,String lastName,String departments) {
		// TODO Auto-generated method stub
		String email_generate=getFirstName().toLowerCase() +"."+ getLastName().toLowerCase()+"@greatLearning."+departments+".com";
		return email_generate;
	}
	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		String CAPITAL_ALPHABETS="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower_alphabets="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String specialCharacters="!@#$%^&*()";
		
		//String allKeys=CAPITAL_ALPHABETS+lower_alphabets+numbers+specialCharacters;
		
		
		String randomPassword=""; 
		Random random=new Random();
		
		for(int i=0;i<2;i++)
		{
			//randomPassword=randomPassword+String.valueOf(allKeys.charAt(random.nextInt(allKeys.length())));	
			randomPassword=randomPassword+String.valueOf(CAPITAL_ALPHABETS.charAt(random.nextInt(CAPITAL_ALPHABETS.length())));
			randomPassword=randomPassword+String.valueOf(lower_alphabets.charAt(random.nextInt(lower_alphabets.length())));
			randomPassword=randomPassword+String.valueOf(numbers.charAt(random.nextInt(numbers.length())));
			randomPassword=randomPassword+String.valueOf(specialCharacters.charAt(random.nextInt(specialCharacters.length())));
		}
		
		return randomPassword;
	}
	
	public void showDetails() {
		System.out.println("Hello "+getFirstName()+" "+getLastName());
		System.out.println("Here are your login details .....!!!");
		System.out.println("Your Email : "+ getEmail());
		System.out.println("Password : "+getPassword());
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
