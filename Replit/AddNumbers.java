// AddNumbers
// This is a simple program that reads two integers
// and computes the sum. This one calls a method instead of 
// doing the calculatiion all in the main code. Note what is the 
// same and what is different.
// You can copy paste all of the test into repl.it and it will run.
// Double forward slashes are comments and will not interfeer with the code.

import java.util.*;

class Main {
  public static void main(String[] args) {
    System.out.println("This script adds two numbers");
    // Specify x,y, and z as integers
        int x;
        int y;
                
      // Instantiate "in" as a new Scanner OBJECT  
        Scanner in = new Scanner(System.in);
      // Writes message to the console
        System.out.println("Enter first integer to calculate their sum");
      // Takes user input "nextInt and assigns to X"        
        x = in.nextInt();
      // Second message to user  
        System.out.println("Enter second integer to calculate their sum");
      // now y is the next integer 
        y = in.nextInt();
        in.close();
       // calls the computeSum method instead of doing it in the main code
      computeSum(x, y);
      // when the computeSum method is finished running execution starts here
        System.out.println("This used a method to sum");
        System.out.println("Sum of the integers = " + computeSum(x,y));
        System.out.println("Press Run Button to start again");
  }// closing brace fro "main" method
// Methods go at the bottom of the main code
// a and b are only used in the method.
  private static int computeSum(int a ,int b) {
  	int c;
    c = a+b; 
  	return c;
  } // closing brace for computeSum method
} // closing brace for "Main" class
