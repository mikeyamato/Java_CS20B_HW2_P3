package app;

import stack.ArrayListStack;
import stack.IStackInterface;

import java.util.Scanner;

public class EditString {
  public static void main (String[] args) {

    Scanner userInput = new Scanner(System.in);
    IStackInterface<String> output = new ArrayListStack<>();

    String nextAction = null;
    String response = null;
    String selection = null;
    String phrase = null;

        System.out.println("Enter a phrase:");
    phrase = userInput.nextLine();

    // use try/catch outside
    while (!nextAction.equalsIgnoreCase("x")){
      System.out.println("Make a selection of one of the following letters...");
      System.out.println("'U' to make all letters uppercase.");
      System.out.println("'L' to make all letters lowercase.");
      System.out.println("'R' to reverse the string.");
      System.out.println("'C ch1 ch2' to change all occurrences of ch1 to ch2 (fyi, ch = character).");
      System.out.println("'Z' to undo the most recent change.");
      System.out.println("'X' to end changes and output results.");
      selection = userInput.nextLine();

      if (selection.startsWith("x"))
        response = output.top();
      else {
        if (selection.startsWith("z")){
          // undo
          output.pop();
        }
        if (selection.startsWith("u")){
          // uppercase
          phrase = output.top();
          phrase.toUpperCase();
          output.push(phrase);
        }
        if (selection.startsWith("l")){
          // lowercase
          phrase = output.top();
          phrase.toLowerCase();
          output.push(phrase);
        }
        if (selection.startsWith("r")){
          // reverse
          phrase = output.top();
          IStackInterface<Character> reverse = new ArrayListStack<>();
//          String input = "Geeks For Geeks";
          char[] charPhrase = phrase.toCharArray();

          for (char c: charPhrase)
            reverse.push(c);

          char[] revCharPhrase = new char[0];

          for (char c: charPhrase) {
            char data = reverse.top();
            reverse.pop();
//            revCharPhrase.add(data);
          }


          // iterate through and add to array
          // convert array to string
          // push to output
        }
        if (nextAction.startsWith("c")){
          // swap
        }
      }
    }
    System.out.println(response);  // display final output
  }

}
