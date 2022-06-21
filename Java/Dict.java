public class Program{
  public static void main(String[] args){

    String[] prims = {
      "Byte Max: " + Byte.MAX_VALUE,
      "Byte Min: " + Byte.MIN_VALUE,
      "Int Max: " + Integer.MAX_VALUE,
      "Int Min: " + Integer.MIN_VALUE,
      "Short Max: " + Short.MAX_VALUE,
      "Short Min: " + Short.MIN_VALUE,
      "Long Max: " + Long.MAX_VALUE,
      "Long Min: " + Long.MIN_VALUE,
      "Float Max: " + Float.MAX_VALUE,
      "Float Min: " + Float.MIN_VALUE,
      "Double Max: " + Double.MAX_VALUE,
      "Double Min: " + Double.MIN_VALUE,
      "Boolean Max: " + true,
      "Boolean Min: " + false
    };
    System.out.println("Java Primitives Max and Min values.");
    for (String i : prims) {
      System.out.println(i);
    }
  }
}
