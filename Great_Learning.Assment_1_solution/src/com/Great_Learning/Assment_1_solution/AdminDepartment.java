package com.Great_Learning.Assment_1_solution;

public class AdminDepartment extends SuperDepartment {

	@Override
	protected String departmentName() {
		return "Admin Department";
	}

	@Override
	protected String getTodaysWork() {
		return "Complete your documents Submission";
	}
	@Override
	protected String getWorkDeadline() {
		return "Complete by EOD";
	}
}