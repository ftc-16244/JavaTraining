// AddTwoNumbers
// This is a simple program that reads two integers
// and computes the sum. All in one main method.
// You can copy paste all of the test into repl.it and it will run.
// Double forward slashes are comments and will not interfeer with the code.

import java.util.*;

class Main {
  public static void main(String[] args) {
    System.out.println("This script adds two numbers");
    // Specify than x,y, and z as integers - do this before you need them
        int x;
        int y;
        int z;
      // Copy the Scanner object to an objecct called "in"  
      Scanner in = new Scanner(System.in);
      // Writes message to the console
        System.out.println("Enter first integer to calculate their sum");
      // Takes user input "nextInt and assigns to X"
      x = in.nextInt();
      // Second message to user  
        System.out.println("Enter second integer to calculate their sum");
      // now y is the next integer 
      y = in.nextInt();
      // closes the "in" scanner object to save memory
      in.close();
      // sum x and Y
      z = x + y;
      // Writes message with "Z" to the console
        System.out.println("Sum of the integers = " + z);     
        System.out.println("Press Run Button to start again");
  }
  }
