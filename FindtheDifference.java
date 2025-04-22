
public class FindtheDifference {
  public char findTheDifference(String s, String t) {
    int[] count = new int[26];

    for (char c : s.toCharArray()) {
      count[c - 'a']++;
    }

    for (char c : t.toCharArray()) {
      count[c - 'a']--;
      if (count[c - 'a'] < 0) {
        return c;
      }
    }

    return 'r';
  }

  public static void main(String[] args) {
    FindtheDifference result = new FindtheDifference();
    String s = "abcd";
    String t = "abcde";

    System.out.println(result.findTheDifference(s, t)); // e
  }
}

