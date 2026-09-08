

import java.util.Scanner;

// program to add 10 to a number, until the user quits

public class Add10Example {

  public static void main(String[] args) {
      try ( // open the scanner
              Scanner scan = new Scanner(System.in)) {
          String input = "";
          
          while (!input.equals("q")) {
              System.out.println();
              System.out.print("Enter a number, or type q to quit: ");
              System.out.add10();
              input = scan.nextLine();
              
              
          }
          
          System.out.println("The user quit. Thank you.");
      }
  }
}
