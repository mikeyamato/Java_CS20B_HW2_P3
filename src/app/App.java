package app;

import stack.EditString;
import stack.IStackInterface;
import java.util.Scanner;

public class App {
  public static void main (String[] args){

    Scanner userInput = new Scanner(System.in);
    IStackInterface<String> edit = new EditString<String>();

    String nextAction = null;
    String response = null;
    String selection = null;

    System.out.println("Enter a phrase:");
    String phrase = userInput.nextLine();

    // use try/catch outside
    do {
      System.out.println("Make a selection of one of the following letters...");
      System.out.println("'U' to make all letters uppercase.");
      System.out.println("'L' to make all letters lowercase.");
      System.out.println("'R' to reverse the string.");
      System.out.println("'C ch1 ch2' to change all occurrences of ch1 to ch2 (fyi, ch = character).");
      System.out.println("'Z' to undo the most recent change.");
      System.out.println("'X' to end changes and output results.");
      selection = userInput.nextLine();

      try{
        nextAction.equalsIgnoreCase(selection);
        response = edit.select(phrase, nextAction);  // methods cannot be void as they need to be returned
      }
      catch (Exception error){
        System.out.println("Error: " + error);
      }

    }
    while (!nextAction.equalsIgnoreCase("x"));
    System.out.println(response);  // display final output



//    IStackInterface<String> editString = new ArrayBoundedStack<>();
//    editString.push("cat");
//    System.out.println(editString.top());
//    editString.push("dog");
//    System.out.println(editString.top());
//    System.out.println(editString.size());
//    editString.swapStart();
//    System.out.println(editString.top());
//    editString.pop();
//    System.out.println(editString.top());
  }
}
