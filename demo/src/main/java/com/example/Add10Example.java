package com.example;


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
              input = scan.nextLine();
              if (!input.equals("q")) {
                  int number = Integer.parseInt(input);
                  System.out.println(number + " + 10 = " + (number + 10));
              }
              
          }
          
          System.out.println("The user quit. Thank you.");
      }
  }
}
