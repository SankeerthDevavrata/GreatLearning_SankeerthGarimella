package driverClass;

import departmentsClass.adminDepartment;
import departmentsClass.hr_Department;
import departmentsClass.techDepartment;
//import departmentsClass.superDepartment;


public class driverMain {

	public static void main(String[] args) {
		adminDepartment obj1 =new adminDepartment();
		hr_Department obj2 =new hr_Department();
		techDepartment obj3 =new techDepartment();
		obj1.show();
		obj2.show();
		obj3.show();

	}
}
