import java.util.Stack;

public class Daily_1081SmallestSubsequenceofDistinctCharacters {
    public static void main(String[] args) {
        String s = "bcabc";
        String ans = smallestSubsequence(s);
        System.out.println(ans);
    }

    public static String smallestSubsequence(String s) {
        int freq[] = new int[26];
        boolean visited[] = new boolean[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']--;
            if (visited[ch - 'a']) {
                continue;
            }
            while (!stack.isEmpty() && stack.peek() > ch && freq[stack.peek() - 'a'] > 0) {
                visited[stack.pop() - 'a'] = false;
            }
            stack.push(ch);
            visited[ch - 'a'] = true;
        }
        System.out.println(stack.peek());

        StringBuilder builder = new StringBuilder();
        for (char ch : stack) {
            // System.out.println(ch); this gives in the reverse order of stack
            builder.append(ch);
        }

        return builder.toString();
    }
}
