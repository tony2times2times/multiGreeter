//Tony Peraza
//17JUN17
//ICS 311-50 
//Assignment 1 
//https://github.com/tony2times2times/multiGreeter

/*I am breaking my golden comment rule of only explaining why not how. I started to only 
explain why but only had a few comments, and thought I would lose points. */

package MultiGreeter;

import java.util.Random;

public class MultiGreeter {
	//Class variables
	private static final int DEFUALT_SIZE = 10;
	private String[] greetings;
	private int greetCount;
	private boolean defaultGreet;

	//MultiGreeter constructor with the default size containing only the default greeting "hello".
	public MultiGreeter() {
		greetings = new String[DEFUALT_SIZE];
		greetings[0] = "hello";
		greetCount = 0;
		defaultGreet = true;
	}
	
	//create a new greeting array with custom size as input. Should only contain default greeting "helo".
	public MultiGreeter(int size) {
		if (size >= 0){
			greetings = new String[size];
		}
		//if someone tried to be funny and enter a number less then one use the default size.
		else{
			greetings = new String[DEFUALT_SIZE];
		}
		greetings[0] = "hello";
		greetCount = 0;
		defaultGreet = true;
	}

	//method to get the total length of greeting array including null values
	public int getMaxGreetings() {
		return greetings.length;
	}
	
	//method to get total number of greetings in the greetings array, excluding null values.
	public int getNumGreetings() {
		//if no greetings have been added there should only be the default return 1
		if (defaultGreet == true){
			return 1;
		}
		//if greetings have been added return the greet count.
		else{
			return (greetCount);
		}
	}
	
	//method takes a string as input and adds it to the greetings array I wish java had a array.push() method
	public boolean addGreeting (String greeting){
		//if there is space left in the array then add the greeting
		if (greetings.length >= greetCount){
			greetings[greetCount] = greeting;
			defaultGreet = false;
			greetCount++;
		return true;
		
		}else{
			//if there is no space left in the greeting array return false
			return false;
		}
	}
	
	public String[] getGreetings(){
		//return the greeting array
		return greetings;
	}
	
	//Method takes a name as input and greets it using a random greeting
	public String greet(String name){
		Random rand = new Random();
		if (defaultGreet){
			return (greetings[0] + " " + name);
		}else{
		int  n = rand.nextInt(greetCount);
		return (greetings[n] + " " + name);
		}
	}
	
	//Given no input a random greeting is selected and the entire 'World' is greeted
	public String greet(){
		Random rand = new Random();
		if (defaultGreet){
			return (greetings[0] + " World");
		}else{
		int  n = rand.nextInt(greetCount);
		return (greetings[n] + " World");
		}
	}
}