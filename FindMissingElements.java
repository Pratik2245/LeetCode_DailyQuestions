import java.util.ArrayList;
import java.util.List;

public class FindMissingElements {
    public static void main(String[] args) {
        int nums[] = { 1, 4, 2, 5 };
        System.out.println(findMissingElements(nums));
    }

    public static List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        boolean freq[] = new boolean[101];
        int high = Integer.MIN_VALUE;
        int low = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < low) {
                low = nums[i];
            }
            if (nums[i] > high) {
                high = nums[i];
            }
            freq[nums[i]] = true;
        }
        for (int j = low; j <= high; j++) {
            if (!freq[j]) {
                list.add(j);
            }
        }
        return list;
    }
}
