// package 4 Sep;

import java.util.Arrays;

public class SmallestStableIndex1 {
    public static void main(String[] args) {
        int arr[] = { 5, 0, 1, 4 };
        int k = 3;
        System.out.println(firstStableIndex(arr, k));
    }

    public static int firstStableIndex(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int suffix[] = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            min = Math.min(min, nums[i]);
            suffix[i] = min;
        }
        System.out.println(Arrays.toString(nums));
        int ans;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            ans = max - suffix[i];
            if (ans <= k) {
                return i;
            }
        }
        return -1;
    }
}
