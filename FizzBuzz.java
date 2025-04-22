import java.util.*;
import java.util.ArrayList;

public class FizzBuzz{
  public List<String> fizzBuzz(int n) {
	  ArrayList<String> answer = new ArrayList<String>();
    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        answer.add("FizzBuzz");
      } else if (i % 5 == 0) {
        answer.add("Buzz");
      } else if (i % 3 == 0) {
        answer.add("Fizz");
      } else {
        answer.add(Integer.toString(i));
      }
    }
    return answer;
  }
  public static void main(String[] args) {
    int n = 15;
    FizzBuzz fizzBuzzInstance = new FizzBuzz();
    List<String> result = fizzBuzzInstance.fizzBuzz(n);
    System.out.println(result);
  }
}

