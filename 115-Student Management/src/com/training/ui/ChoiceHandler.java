package com.training.ui;

import com.training.actions.Action;
import com.training.actions.AddAction;
import com.training.actions.DeleteAction;
import com.training.actions.ExitAction;
import com.training.actions.ListAction;
import com.training.actions.SearchAction;
import com.training.actions.UpdateAction;

public class ChoiceHandler {

	public static void handleChoice(int choice) {

		Action action = null;

		switch (choice) {

		case 1:

			action = new AddAction();

			break;

		case 2:

			action = new SearchAction();

			break;

		case 3:

			action = new UpdateAction();

			break;

		case 4:

			action = new ListAction();

			break;

		case 5:

			action = new DeleteAction();

			break;

		case 6:

			action = new ExitAction();

			break;

		default:
			new ExitAction();

		}

		action.go();

	}

}
