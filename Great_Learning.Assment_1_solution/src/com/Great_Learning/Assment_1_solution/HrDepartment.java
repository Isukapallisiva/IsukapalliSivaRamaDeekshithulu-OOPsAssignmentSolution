package com.Great_Learning.Assment_1_solution;

public class HrDepartment extends SuperDepartment {

	@Override
	protected String departmentName() {
		return "HR Department";
	}

	@Override
	protected String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}

	@Override
	protected String getWorkDeadline() {
		return "Complete by EOD";
	}

	protected String doActivity() {
		return "team Lunch";
	}
}
