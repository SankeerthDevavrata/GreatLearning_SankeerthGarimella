package lab1_OOPS_LoginInterface;

public interface LoginInterface {
	String generateEmail(String firstname, String lastname,String dept);
	String generatePassword();
	void showDetails();
}
