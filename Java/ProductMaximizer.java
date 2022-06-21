// Product Maximizer : Find the 2 numbers in an array that result in the highest product.
// By Andres Reyes Jr.
public class ProductMaximizer{
  public static void main(String[] args){
    int[] input = new int[]{10, 2, 34, 1, 2, 400};
    int max1 = 0;
    int max2 = 0;
    for (int cur : input){
      if (cur > max1){
        max2 = max1;
        max1 = cur;
      }
    }
    System.out.println("Max1: " + max1);
    System.out.println("Max2:" + max2);
    System.out.println("Product: " + max1*max2);
  }
}
