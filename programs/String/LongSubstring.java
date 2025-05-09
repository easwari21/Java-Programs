import java.util.HashMap;

public class LongSubstring {
    public static void main(String[] args) {
        String str = "pwwkedfsaw";
        int maxi= 0;
        int left = 0;
        //using hashmap here
        //hashing is a reduction process
        //time complexity is O(n)
        //wrapper class
        HashMap<Character, Integer> position = new HashMap<>();
        int start = 0; 
        for (int right = 0; right < str.length(); right++) {
            char current = str.charAt(right);
            if (position.containsKey(current)) 
            {
                 left = Math.max(left, position.get(current) + 1);
            }
            position.put(current, right);
            if (maxi < (right - left) + 1) 
            {
                maxi = (right - left) + 1;
                start = left; 
            }
        }

        String longestSubstring = str.substring(start, start + maxi);
        System.out.println("Longest substring: " + longestSubstring);
        System.out.println("Maximum length: " + maxi);
    }
}
