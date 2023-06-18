package departmentsClass;

public class adminDepartment extends superDepartment{
	String dName;
	String todayWork;
	String workDeadLine;
	String holiday;
	public adminDepartment(){
	dName=departmentName();
	todayWork=getTodaysWork();
	workDeadLine=getWorkDeadline();
	holiday=isTodayAHoliday();
	}
	
	public void show() {
		System.out.println("Welcome to " +dName);
		System.out.println(todayWork);
		System.out.println(workDeadLine);
		System.out.println(holiday);
		System.out.println();
	}
	public String departmentName() {
		return "Admin Department";
	}
	
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

}
