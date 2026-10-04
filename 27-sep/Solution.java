import java.util.*;

class Solution1 {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String str : strs) {
            sb.append(str.length()).append("#").append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            int j = i;

            while (s.charAt(j) != '#') {
                j++;
            }

            int len = Integer.parseInt(s.substring(i, j));
            
            j++;

            result.add(s.substring(j, j + len));

            i = j + len;
        }

        return result;
    }
}

public class Solution {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();

        List<String> strs = Arrays.asList(
                "Hello",
                "World",
                "",
                "abc#123",
                "Java Programming");

        System.out.println("Original List:");
        System.out.println(strs);

        String encoded = solution.encode(strs);
        System.out.println("\nEncoded String:");
        System.out.println(encoded);

        List<String> decoded = solution.decode(encoded);
        System.out.println("\nDecoded List:");
        System.out.println(decoded);
    }
}