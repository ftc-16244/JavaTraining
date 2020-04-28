// getCubeData
// This program promts for the length of the side of a cube. 
// input is echod back to the console. Then two methods are called to 
// calculate the surface area and volume of the cube.
// 
// You can copy paste all of the test into repl.it and it will run.
// Double forward slashes are comments and will not interfeer with the code.

import java.util.*; // import utilites to get Scanner to work
class Main {
  public static void main(String[] args) {
        System.out.println("This program computes the surface area and volume of a cube");
        // Specify edge before you use it. It is an integer
        int edge;        
        double SA;
        double V;
        
        // Instantiate "in" as a new Scanner OBJECT  
        // "in" is a copy of the Scanner object and can do anything Scanner can
        Scanner in = new Scanner(System.in);
      // Writes message to the console
        System.out.println("Enter the edge length of your cube (must be an integer)");
      // Takes user input "in.nextInt and assigns to edge"
       // "nextIn()t" is a method that belongs to Scanner and now in.
       // setting "edge" equal to in.nextInt() assigns the method output to edge. 
        edge = in.nextInt();
        //close the Scanner to save rewources.
        in.close();

        System.out.println("You entered "+ edge);
        // SA now contains the result of the getSurface method
        SA = getSurfArea(edge);
        System.out.println("Surface Area is " + SA);
        V = getVolume(edge);
        System.out.println("Volume is " + V);
        
  }
// these are the two methods that actually do the calculations.
// They are called from lines //24 and 26.
  private static double getSurfArea(int x){
  int surfArea;
  surfArea = x*x*6;
  return surfArea;  
  }
  private static double getVolume(int x){
  int Vol;
  // there is a better way to cube a number we will talk later on this.
  Vol=x*x*x;
  return Vol;  
  }
  
}
