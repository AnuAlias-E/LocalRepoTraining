package com.training.ui;

public class Main {
	public static void main(String[] args) {
		MenuHandler menuHandler = new MenuHandler();
		int choice;
		do {
			menuHandler.displayMenu();
			choice = menuHandler.getChoice();
			ChoiceHandler.handleChoice(choice);
		} while (choice < 6);

	}
}
