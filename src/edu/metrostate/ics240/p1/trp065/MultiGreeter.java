//Tony Peraza
//17JUN17
//ICS 240-01 
//Assignment 1 
//https://github.com/tony2times2times/multiGreeter

package edu.metrostate.ics240.p1.trp065;

import java.util.Random;

public class MultiGreeter {
	private static final int DEFUALT_SIZE = 10;
	private String[] greetings;
	private int greetCount;
	private boolean defaultGreet;

	// MultiGreeter constructor with the default size containing only the default greeting "hello".
	public MultiGreeter() {
		greetings = new String[DEFUALT_SIZE];
		greetings[0] = "hello";
		greetCount = 0;
		defaultGreet = true;
	}

	// Create a new greeting array with custom size as input. Should only contain default greeting "hello".
	public MultiGreeter(int size) {
		if (size > 0) {
			greetings = new String[size];
		}
		// If someone entered a negative number use the default size.
		else {
			greetings = new String[DEFUALT_SIZE];
		}
		greetings[0] = "hello";
		greetCount = 0;
		defaultGreet = true;
	}

	// Method to get the total length of greeting array including null values.
	public int getMaxGreetings() {
		return greetings.length;
	}

	// Method to get total number of greetings in the greetings array, excluding null values.
	public int getNumGreetings() {
		// If no greetings have been added there should only be the default greeting; return 1.
		if (defaultGreet == true) {
			return 1;
		}
		// If greetings have been added return the greet count.
		else {
			return (greetCount);
		}
	}

	// Method takes a string as input and adds it to the greetings array. I wish java had a array.push() method.
	public boolean addGreeting(String greeting) {
		// If there is space left in the array then add the greeting.
		if (greetings.length >= greetCount) {
			greetings[greetCount] = greeting;
			defaultGreet = false;
			greetCount++;
			return true;

		}
		// If there is no space left in the greeting array return false.
		else {
			return false;
		}
	}

	// Return the greeting array.
	public String[] getGreetings() {
		return greetings;
	}

	// Method takes a name as input and greets it using a random greeting from greetings.
	public String greet(String name) {
		Random rand = new Random();
		if (defaultGreet) {
			return (greetings[0] + ", " + name + "!");
		} else {
			int index = rand.nextInt(greetCount);
			return (greetings[index] + ", " + name + "!");
		}
	}

	// Given no input a random greeting is selected from greetings, and the entire 'World' is greeted.
	public String greet() {
		Random rand = new Random();
		if (defaultGreet) {
			return (greetings[0] + ", World!");
		} else {
			int index = rand.nextInt(greetCount);
			return (greetings[index] + ", World!");
		}
	}
}