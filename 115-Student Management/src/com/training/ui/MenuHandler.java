package com.training.ui;

import com.training.ui.util.ConsoleIO;

public class MenuHandler {
	public void displayMenu() {
		String[] options = { "Add New Student", "Search Student", "Update Student", "List All Students",
				"Delete Student", "Exit" };
		System.out.println("\t\t\t\t MENU");
		for (int i = 0; i < options.length; i++) {
			System.out.println("\t\t" + (i + 1) + "." + options[i]);
		}
	}
 
	public int getChoice() {
		ConsoleIO.prompt("Enter your choice ");
		int choice = ConsoleIO.intInput();
		return choice;
	}
}