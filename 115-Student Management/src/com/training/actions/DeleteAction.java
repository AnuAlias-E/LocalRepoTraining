package com.training.actions;

import com.training.service.StudentService;
import com.training.service.StudentServiceImpl;
import com.training.ui.util.ConsoleIO;

public class DeleteAction extends Action {
	@Override
	public void init() {
		System.out.println("\n\n");
		System.out.println("\t\t Delete Student");
		System.out.println("\t\t --------------------");

	}

	@Override
	public void execute() {
		int rollNumberToDelete;
		ConsoleIO.prompt("Enter Roll Number to delete");
		rollNumberToDelete = ConsoleIO.intInput();

		StudentService service = StudentServiceImpl.getInstance();
		System.out.println();
		service.deleteStudent(rollNumberToDelete);

	}

	@Override
	public void complete() {

		System.out.println("\n\n");
		System.out.println("\t\t Deleting student completed");
		System.out.println("\n\n");
	}
}
