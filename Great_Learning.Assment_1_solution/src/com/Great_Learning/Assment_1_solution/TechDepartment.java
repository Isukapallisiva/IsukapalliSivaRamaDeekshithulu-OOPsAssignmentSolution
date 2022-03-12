package com.Great_Learning.Assment_1_solution;

public class TechDepartment extends SuperDepartment {
	@Override
	protected String departmentName() {
		return "Tech Department";
	}

	@Override
	protected String getTodaysWork() {
		return "Complete coding of Module 1";
	}

	@Override
	protected String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	protected String getTechStackInformation() {
		return " Core Java";
	}

}