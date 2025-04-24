import java.util.*;

public class AddDigits {
  public int addDigits(int num) {
    while (String.valueOf(num).length() != 1) {
      int sum = 0;
      while (num != 0 ) {
        sum = sum + num % 10;
        num = num/10;
      }
      num = sum;
    }

    return num;
  }
 
  public static void main(String[] args) {
    AddDigits result = new AddDigits();
    System.out.println(result.addDigits(576));
  }
}









