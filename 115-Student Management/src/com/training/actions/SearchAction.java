package com.training.actions;

import com.training.model.Student;
import com.training.service.StudentService;
import com.training.service.StudentServiceImpl;
import com.training.ui.util.ConsoleIO;

public class SearchAction extends Action {

	@Override
	public void init() {
		System.out.println("\n\n");
		System.out.println("\t\t Search Student");
		System.out.println("\t\t --------------------");

	}

	@Override
	public void execute() {
		int searchRollNumber;

		ConsoleIO.prompt("Enter Roll Number to Search");
		searchRollNumber = ConsoleIO.intInput();

		StudentService service = StudentServiceImpl.getInstance();
		Student student = service.searchStudent(searchRollNumber);

		if (student != null) {
			System.out.println("\t\t Roll Number\t: " + student.getRollNumber());
			System.out.println("\t\t Name\t\t: " + student.getName());
			System.out.println("\t\t Gender\t\t: " + student.getGender());
			System.out.println("\t\t Mark1\t\t: " + student.getMark1());
			System.out.println("\t\t Mark2\t\t: " + student.getMark2());
			System.out.println("\t\t Total Mark\t: " + student.getTotal());
			System.out.println("\t\t Average\t: " + student.getAverage());
			System.out.println();
		} else {
			System.out.println("\n\n\t\t Student Not Found !!! ");
		}

	}

	@Override
	public void complete() {
		System.out.println("\t\t Searching student completed");
		System.out.println("\n\n");

	}

}
