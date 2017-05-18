//Tony Peraza
//17JUN17
//ICS 240-01 
//Test for Assignment 1 
//https://github.com/tony2times2times/multiGreeter

package edu.metrostate.ics240.p1.trp065;

import java.util.Arrays;

public class MultiGreeterTest {

	public static void main(String[] args) {
		boolean fubar = false;
		//Fun fact I lived in Tokyo for 3 years.
		
		//Test MultiGreeter with a no argument constructor.
		MultiGreeter hello = new MultiGreeter();
		//Test Methods getMaxGreetings() and getNumGreetings()
		if (hello.getMaxGreetings() != 10 || hello.getNumGreetings() != 1) {
			fubar = true;
			System.out.println("Unexpected result found in hello.getNumGreetings() or hello.getMaxGreetings()");
		}
		
		//Test adding greetings to the array.
		hello.addGreeting("konichiwa");
		//test the greet Methods both with and without arguments 
		if (!hello.greet().equals("konichiwa, World!") || !hello.greet("me").equals("konichiwa, me!")) {
			fubar = true;
			System.out.println("Unexpected result found in hello.addGreeting('konichiwa')");
		}
		
		//test adding another greeting to the array
		hello.addGreeting("ohayo gozaimasu");
		//Set tester to a no arguments greeting.
		String tester = hello.greet();
		//Make sure tester is one of the two added greetings and that there are only two greetings.
		if (!(tester.equals("konichiwa, World!") || tester.equals("ohayo gozaimasu, World!"))
				|| hello.getNumGreetings() != 2) {
			fubar = true;
			System.out.println("Unexpected result found in hello.addGreeting('ohayo gozaimasu')");
		}
		
		//Test creating a MultiGreeter with an array size of 2
		MultiGreeter goodbye = new MultiGreeter(2);
		goodbye.addGreeting("sayonara");
		goodbye.addGreeting("jaa ne");
		//Convert the array to a string so the results can be tested.
		String goodbyeString = Arrays.toString(goodbye.getGreetings());
		//Compare goodbyeString to the expected output. This tests the getGreetings method.
		if (!goodbyeString.equals("[sayonara, jaa ne]")) {
			fubar = true;
			System.out.println("Unexpected result found in goodbye.getGreetings()");
		}
		
		//After testing is complete print a system status.
		if (fubar) {
			System.out.println("WARNING: ERROR DETECTED");
		} else {
			System.out.println("Everythings shinny cap'n");
		}
	}

}
