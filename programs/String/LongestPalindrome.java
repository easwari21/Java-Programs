public class LongestPalindrome {
    public static String longestPalindrome(String s) {
      if (s == null || s.isEmpty()) return "";
      String longest = "";
      for (int i = 0; i < s.length(); i++) {
        String p1 = expand(s, i, i);
        String p2 = expand(s, i, i + 1);
        if (p1.length() > longest.length()) longest = p1;
        if (p2.length() > longest.length()) longest = p2;
      }
      return longest;
    }
    private static String expand(String s, int l, int r) {
      while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
        l--;
        r++;
      }
      return s.substring(l + 1, r);
    }
    public static void main(String[] args) {
      String testString = "ababaca";
      System.out.println("Longest Palindrome: " + longestPalindrome(testString));
    }
  }