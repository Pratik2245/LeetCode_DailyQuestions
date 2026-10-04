import java.util.Arrays;

public class isAnagram {
    public static void main(String[] args) {
        String s = "racecar", t = "carrace";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int freq[] = new int[26];
        // for (char ch : s.toCharArray()) {
        // freq[ch - 'a']++;
        // }

        // for (char ch : t.toCharArray()) {
        // freq[ch - 'a']--;
        // }
        // System.out.println(Arrays.toString(freq));
        // for (int i = 0; i < freq.length; i++) {
        // if (freq[i] != 0) {
        // return false;
        // }
        // }
        // return true;

        // other method

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        return true;

    }
}
