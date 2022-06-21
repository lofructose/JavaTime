import java.util.Scanner;

public class Program{

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("lbs: ");
    String inputz = scanner.nextLine();
    double lbs = Double.valueOf(inputz);

    System.out.println("kgs: " + lbs * 0.45359237);
  }

}
