package practice.akashumate.main;

import practice.akashumate.model.SuperDepartment;
import practice.akashumate.model.AdminDepartment;
import practice.akashumate.model.HrDepartment;
import practice.akashumate.model.TechDepartment;


class Driver {
	
	public static void main(String[] args) {
		SuperDepartment superDept = new SuperDepartment();
		
		AdminDepartment admin = new AdminDepartment();
		admin.departmentName();
		admin.getTodaysWork();
		admin.getWorkDeadline();
		superDept.isTodayAHoliday();
		
		System.out.println();
		
		HrDepartment hr = new HrDepartment();
		hr.departmentName();
		hr.doActivity();
		hr.getTodaysWork();
		hr.getWorkDeadline();
		superDept.isTodayAHoliday();
		
		System.out.println();
		
		TechDepartment tech = new TechDepartment();
		tech.departmentName();
		tech.getTodaysWork();
		tech.getWorkDeadline();
		tech.getTechStackInformation();
		superDept.isTodayAHoliday();
	}

}
