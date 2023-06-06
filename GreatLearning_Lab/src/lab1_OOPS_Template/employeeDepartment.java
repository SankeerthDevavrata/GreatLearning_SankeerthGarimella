package lab1_OOPS_Template;

public class employeeDepartment extends employeeName {
	String departments;
	employeeDepartment(){}
	employeeDepartment(String firstName,String lastName,String departments){
		super(firstName,lastName);
		this.departments=departments;
	}
	public String getDepartments() {
		return departments;
	}
	public void setDepartments(String departments) {
		this.departments = departments;
	}
	
}
