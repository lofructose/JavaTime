import java.util.Scanner;
public class Rev2{

  static void Reverser(String toBe){
      String[] toBeArray = toBe.split("\\s+");
      String output = "";
      for (int counter = toBeArray.length - 1; counter >= 0; counter--){
        output += String.valueOf(toBeArray[counter]) + " ";
      }
      System.out.println("Here is your reversed sentence" + "\n" + output);
  }

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome to Reverser. It will take your sentences and reverse them. Enter your sentence below:");
    String inputz = scanner.nextLine();
    Reverser(String.valueOf(inputz));
  }
}
