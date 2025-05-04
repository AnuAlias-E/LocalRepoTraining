package com.training.actions;
 
public abstract class Action {
	public void go() {
		init();
		execute();
		complete();
	}
 
	public abstract void init();
 
	public abstract void execute();
 
	public abstract void complete();
}