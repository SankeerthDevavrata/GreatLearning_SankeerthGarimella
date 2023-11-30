package departmentsClass;

public class techDepartment extends superDepartment {
	String dName;
	String todayWork;
	String workDeadLine;
	String holiday;
	String techStackInfo;
	
	public techDepartment() {
		dName=departmentName();
		todayWork=getTodaysWork();
		workDeadLine=getWorkDeadline();
		holiday=isTodayAHoliday();
		techStackInfo=getTechStackInformation();
	}
	
	public void show() {
		System.out.println("Welcome to " + dName);
		System.out.println(todayWork);
		System.out.println(workDeadLine);
		System.out.println(techStackInfo);
		System.out.println(holiday);
		System.out.println();
	}
	
	public String departmentName() {
		return "Tech Department ";
	}
	
	public String getTodaysWork() {
		return "Complete coding of module 1";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String getTechStackInformation() {
		return "core Java";
	}
}
