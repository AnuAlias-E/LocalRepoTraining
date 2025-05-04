package com.training.ui;

import java.util.HashMap;

public class HashMapImpl {
	  public static void main(String[] args) {

	    // create a hashmap
	    HashMap<String, Integer> languages = new HashMap<>();

	    // add elements to hashmap
	    languages.put("Java", 8);
	    languages.put("JavaScript", 1);
	    languages.put("Python", 3);
	    languages.put(null, 3);
	    languages.put(null, 3);
	    System.out.println("HashMap: " + languages);
	  }
	}
