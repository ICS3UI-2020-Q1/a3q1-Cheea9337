import java.util.Scanner;
/**
 * Find the biggest integer between three numbers
 * @author Aidan Cheesmond
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);
    
    // ask the user for three integers
    System.out.println("Please enter three integers on separate lines");
    int firstInteger = input.nextInt();
    int secondInteger = input.nextInt();
    int thirdInteger = input.nextInt();

    if(firstInteger > secondInteger && firstInteger > thirdInteger){
      System.out.println("Maximum: " + firstInteger);
    } else if(secondInteger > firstInteger && secondInteger > thirdInteger){
      System.out.println("Maximum: " + secondInteger);
    } else if(thirdInteger > firstInteger && thirdInteger > secondInteger){
      System.out.println("Maximum: " + thirdInteger);
    } else {
      System.out.println("There is no maximum number");
    }

  }
}
