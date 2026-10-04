import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int nums[] = { 2, 20, 4, 10, 3, 4, 5 };
        int ans = longestConsecutive(nums);
        System.out.println(ans);
    }

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }
        int longest = 0;
        for (int num : hashSet) {
            if (!hashSet.contains(num - 1)) {
                int current = num;
                int length = 1;
                while (hashSet.contains(current + 1)) {
                    current++;
                    length++;
                }
                longest = Math.max(length, longest);
            }
        }
        return longest;
    }
}
