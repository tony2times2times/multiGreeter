//Tony Peraza
//17JUN17
//ICS 311-50 
//Assignment 1 

package MultiGreeter;

import java.util.Random;

public class MultiGreeter {
	private static final int DEFUALT_SIZE = 10;
	private String[] greetings;
	private int greetCount;
	private boolean defaultGreet;

	public MultiGreeter() {
		greetings = new String[DEFUALT_SIZE];
		greetings[0] = "hello";
		greetCount = 0;
		defaultGreet = true;
	}
	
	public MultiGreeter(int size) {
		if (size >= 0){
		greetings = new String[size];
		}else{
			greetings = new String[DEFUALT_SIZE];
		}
		greetings[0] = "hello";
		greetCount = 0;
		defaultGreet = true;
	}

	public int getMaxGreetings() {
		return greetings.length;
	}
	
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
	
	public boolean addGreeting (String greeting){
		if (greetings.length >= greetCount){
			greetings[greetCount] = greeting;
			defaultGreet = false;
			greetCount++;
		return true;
		
		}else{
			return false;
		}
	}
	
	public String[] getGreetings(){
		return greetings;
	}
	
	public String greet(String name){
		Random rand = new Random();
		if (defaultGreet){
			return (greetings[0] + " " + name);
		}else{
		int  n = rand.nextInt(greetCount);
		return (greetings[n] + " " + name);
		}
	}
	
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