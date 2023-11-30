package departmentsClass;

public class hr_Department extends superDepartment{
	String dName;
	String todayWork;
	String workDeadLine;
	String holiday;
	String activity;
	
	public hr_Department() {
		dName=departmentName();
		todayWork=getTodaysWork();
		workDeadLine=getWorkDeadline();
		activity=doActivity();
		holiday=isTodayAHoliday();
	}
	
	public void show() {
		System.out.println("Welcome to " +dName);
		System.out.println(activity);
		System.out.println(todayWork);
		System.out.println(workDeadLine);
		System.out.println(holiday);
		System.out.println();
	}
	
	public String departmentName() {
		return "Hr Department";
	}
	
	public String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String doActivity() {
		return "team Lunch";
	}
}
