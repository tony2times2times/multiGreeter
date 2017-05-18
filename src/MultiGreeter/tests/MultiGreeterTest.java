package MultiGreeter.tests;

import java.util.Arrays;

import MultiGreeter.MultiGreeter;

public class MultiGreeterTest {

	public static void main(String[] args) {
		boolean fubar = false;
		
		MultiGreeter hello = new MultiGreeter();
		if (hello.getMaxGreetings() != 10 || hello.getNumGreetings() != 1 ){
			fubar = true;
			System.out.println("Unexpected result found in hello.getNumGreetings() "
					+ "or hello.getMaxGreetings() ");
		};
		
		hello.addGreeting("konichiwa");
		if (!hello.greet().equals("konichiwa World") || 
				!hello.greet("me").equals("konichiwa me")){
			fubar = true;
			System.out.println("Unexpected result found in hello.addGreeting('konichiwa')");
		}
		
		hello.addGreeting("ohayo gozaimasu");
		String tester = hello.greet();
		if (!(tester.equals("konichiwa World") ||
				tester.equals("ohayo gozaimasu World")) ||
				hello.getNumGreetings() != 2){
			fubar = true;
			System.out.println("Unexpected result found in hello.addGreeting('ohayo gozaimasu')");
		}
		
		MultiGreeter goodbye = new MultiGreeter(2);
		goodbye.addGreeting("sayonara");
		goodbye.addGreeting("jaa ne");
		String arr = Arrays.toString(goodbye.getGreetings());
		if( !arr.equals("[sayonara, jaa ne]")){
			fubar = true;
			System.out.println("Unexpected result found in goodbye.getGreetings()");
		}
		
		if (fubar){System.out.println("WARNING: ERROR DETECTED");}
		if (!fubar){System.out.println("Everythings shinny cap'n");}
	}
	

}
