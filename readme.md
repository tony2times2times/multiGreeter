# MultiGreeter

First assignment for ICS 340 at Metrostate University.

## Description:
The classic “HelloWorld” program is a simple program used to illustrate the
basic syntax of a programming language. In its simplest form, the program
displays the text “Hello, World!” to the user. It can serve as a great starting
point to explore and learn more complex concepts.

## Assignment:

Create a MultiGreeter class with the following capabilities:

### Constructors
#### MultiGreeter()
No-argument constructor; greeter will have 1 default greeting “Hello”;

#### MultiGreeter(int maxGreetings)
Creates a greeter that can hold up to maxGreetings greeting strings.
MaxGreetings must be non-negative--it can be 0.

### Methods
#### getMaxGreetings() : int
Returns the maxGreetings, that is, the maximum number of greetings that can be
added to this Greeter

#### getNumGreetings(): int
Returns the actual number of greetings added to this greeter.

#### addGreeting(String greeting) : boolean
Adds a greeting to this Greeter. If Greeter already has maxGreetings added, the
greeting will not be added and the method will return false; otherwise the
method will return true.

#### getGreetings(): String []
Returns an array containing the greeting strings added to this Greeter

#### greet(String name) : String
Returns a salutation in the form “greetingString, name!”, where greetingString
is one of the greeting strings added to the Greeter picked at random. If not
greetings have been added, the system will use the default greeting "Hello"
name – a provided name.

#### greet() : String
As specified above, however the system will use the default name, “World”

## Specifications:

### Requirements

#### Project Submission
Your submission shall be an exported Eclipse project zip file

The name of the project shall be in the form:

P1_AAAnnn_MultiGreeter

AAAnnn will serve as your “student identifier”, where

AAA – your initials (two or three characters)

nnn – the last 3 digits of your Metro State student ID

Please name your zip file P1_AAAnnn_MultiGreeter.zip

The zip file must have the Java sources.

#### Code

Place your class in package edu.metrostate.ics240.p1.aaannn

where aaannn is your student identifier as specified above, making sure your
initials are lower-case.

The Constructors and methods defined in the capabilities table must be public,
spelled as specified, and with the return type as specified (void otherwise)

Your submissions will be tested with an automated testing framework

Your code must be free of compile-time errors

Your code should comply with the Java Programming Style Guidelines

#### Due: 05/18/2017 at 12 noon



