public class Rev{

  public static void main(String[] args){
      String input = "hello world. programmed to speak and not to feel.";
      String output = "";
      System.out.println(input);
      String[] inputArray = input.split("\\s+");
      for (String cur : inputArray){
        // System.out.println(cur);
      };
      //basic reverser. does not account for periods or capitals.
      for(int counter = inputArray.length - 1; counter >= 0; counter--){
        output += String.valueOf(inputArray[counter]) + " ";
      };
      System.out.println(output);
  }
}
